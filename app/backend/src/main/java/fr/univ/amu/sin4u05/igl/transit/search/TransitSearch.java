package fr.univ.amu.sin4u05.igl.transit.search;

import fr.univ.amu.sin4u05.igl.routes.*;
import fr.univ.amu.sin4u05.igl.search.EdgeConsumer;
import fr.univ.amu.sin4u05.igl.search.Path;
import fr.univ.amu.sin4u05.igl.search.Search;
import fr.univ.amu.sin4u05.igl.search.SearchDriver;
import fr.univ.amu.sin4u05.igl.transit.graph.*;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataSet;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TransitSearch implements RouteSearch {

    private final TransitGraph graph;

    public TransitSearch(GTFSDataSet dataSet) {
        this.graph = new TransitGraph(dataSet);
    }

    public Route search(LocalDateTime startTime,
                        Station startStation,
                        Station goalStation) {

        return this.search(startTime, startStation, goalStation, null);
    }

    public List<Route> search(LocalDateTime startTime,
                              Station startStation,
                              Station goalStation,
                              int maxRoutes) {

        return this.search(startTime, startStation, goalStation, maxRoutes, null);
    }

    public Route search(LocalDateTime startTime,
                        Station startStation,
                        Station goalStation,
                        Consumer<Double> progressMonitor) {

        List<Route> routes = search(startTime, startStation, goalStation, 1, progressMonitor);
        return routes.isEmpty() ? null : routes.get(0);
    }

    public List<Route> search(LocalDateTime startTime,
                              Station startStation,
                              Station goalStation,
                              int maxRoutes,
                              Consumer<Double> progressMonitor) {

        if (startStation.equals(goalStation)) return null;

        TransitNode startNode = graph.getStartNodeFor(startStation);
        TransitNode goalNode = graph.getGoalNodeFor(goalStation);

        ProgressMonitorAdapter progressMonitorAdapter = progressMonitor != null ?
                new ProgressMonitorAdapter(progressMonitor, startNode, goalNode, maxRoutes) : null;

        Preference[] preferences = Preference.values();
        Set<Route> routes = new LinkedHashSet<>();
        for (int i = 0; i < maxRoutes; i++) {
            if (progressMonitor != null) progressMonitorAdapter.startNewRoute();

            State startState = new State(startTime);

            TransitSearchDriver searchDriver =
                    new TransitSearchDriver(graph, startTime, goalNode, preferences[i % preferences.length]);

            Path<TransitEdge> path =
                    Search.search(startNode, startState, goalNode, searchDriver, progressMonitorAdapter);

            if (path != null && !path.getEdges().isEmpty()) {
                Route route = buildRoute(startTime, path);
                assert route != null;

                routes.add(route);
                if (i > 0 && i % preferences.length == 0)
                    startTime = route.getDepartureTime().plus(5, ChronoUnit.MINUTES);
            } else {
                startTime = startTime.plus(10, ChronoUnit.MINUTES);
            }
        }

        return routes.stream()
                .sorted(Comparator
                        .comparing(Route::getArrivalTime)
                        .thenComparing(Route::getDuration)
                        .thenComparing(TransitSearch::totalWalkingTime)
                )
                .collect(Collectors.toList());
    }

    private static Duration totalWalkingTime(Route route) {
        return route.getSteps().stream()
                .filter(s -> s.getType() == RouteStepType.Connection)
                .map(RouteStep::getDuration)
                .reduce(Duration.ZERO, Duration::plus);
    }

    private class TransitSearchDriver implements SearchDriver<TransitNode, TransitEdge, State> {

        private final TransitGraph graph;
        private final LocalDateTime startTime;
        private final TransitNode goalNode;
        private final Preference preference;

        TransitSearchDriver(TransitGraph graph, LocalDateTime startTime, TransitNode goalNode, Preference preference) {
            this.graph = graph;
            this.startTime = startTime;
            this.goalNode = goalNode;
            this.preference = preference;
        }

        @Override
        public void forEachEdgeFrom(TransitNode sourceNode, State sourceState,
                                    EdgeConsumer<TransitNode, TransitEdge, State> consumer) {

            sourceNode.forEachEdgeAfter(sourceState.currentTime, edge -> {

                // The implementations of TransitEdge.traverse(currentTime) test if the event
                // described by the edge can happen after currentTime. If not they can return null.
                LocalDateTime newTime = edge.traverse(startTime, sourceState.currentTime);

                // Filter the edges that can indeed be traversed.
                if (newTime == null) return;

                TransitNode targetNode = edge.target();

                // Build a new state for the target node
                State targetState = sourceState.traverse(edge, startTime, newTime);

                consumer.accept(edge, targetNode, targetState);
            });
        }

        @Override
        public double costFromStart(TransitNode node, State state) {
            return preference.costFromStart(node, state);
        }

        @Override
        public double estimateCostToGoal(TransitNode node, State state) {
            return preference.estimateCostToGoal(graph, node, state, goalNode);
        }
    }

    public enum Preference {

        NORMAL {
            @Override
            public double costFromStart(TransitNode node, State state) {
                double cost = state.totalDuration;
                return penalties(state, cost, 1, 10, 0);
            }
        },

        LATE_START {
            @Override
            public double costFromStart(TransitNode node, State state) {
                int firstWait = state.firstWaitTime - state.walkingTime;
                double cost = state.totalDuration - (firstWait <= 15 * 60 ? firstWait : 0);
                return penalties(state, cost, 2, 10, 0);
            }
        };

        abstract double costFromStart(TransitNode node, State state);

        private static double penalties(State state, double cost,
                                        int walkingTimeCount,
                                        int minutesPerConnection,
                                        int minutesPerTransportStop) {
            cost += walkingTimeCount * state.walkingTime;
            cost += minutesPerConnection * 60 * (state.connectionCount > 1 ? state.connectionCount - 1 : 0);
            cost += minutesPerTransportStop * 60 * state.transportStopCount;
            return cost;
        }

        double estimateCostToGoal(TransitGraph graph, TransitNode node, State state, TransitNode goalNode) {
            return graph.getAverageTransportTime(node, goalNode) * 1.5
                    - (node.type == TransitNodeType.RouteStep ? 5 * 60 : 0)
                    + (node.type == TransitNodeType.Wait ? 5 * 60 : 0);
        }
    }

    public static class State {
        final LocalDateTime currentTime;
        final int totalDuration;
        final int transportStopCount;
        final int connectionCount;
        final int firstWaitTime;
        final int waitTime;
        final int walkingTime;
        final int busTime;
        final int tramTime;
        final int subwayTime;

        State(LocalDateTime startTime) {
            this(startTime, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        State(LocalDateTime currentTime, int totalDuration,
              int transportStopCount, int connectionCount,
              int firstWaitTime, int waitTime,
              int walkingTime, int busTime,
              int tramTime, int subwayTime) {

            this.currentTime = currentTime;
            this.totalDuration = totalDuration;
            this.transportStopCount = transportStopCount;
            this.connectionCount = connectionCount;
            this.firstWaitTime = firstWaitTime;
            this.waitTime = waitTime;
            this.walkingTime = walkingTime;
            this.busTime = busTime;
            this.tramTime = tramTime;
            this.subwayTime = subwayTime;
        }

        State traverse(TransitEdge edge, LocalDateTime startTime, LocalDateTime newTime) {
            boolean tripWait = edge.type == TransitEdgeType.TripWait;
            boolean tripStep = edge.type == TransitEdgeType.TripStep;
            boolean transfer = edge.type == TransitEdgeType.Transfer;
            TransportLineType lineType = tripStep ? ((TransitTripStepEdge) edge).getTrip().getRoute().getType() : null;

            int totalDuration = (int) Duration.between(startTime, newTime).toSeconds();
            int edgeDuration = (int) Duration.between(currentTime, newTime).toSeconds();
            return new State(
                    newTime,
                    totalDuration,
                    transportStopCount + (tripStep ? 1 : 0),
                    connectionCount + (tripWait ? 1 : 0),
                    connectionCount == 0 && tripWait ? totalDuration : firstWaitTime,
                    waitTime + (tripWait ? edgeDuration : 0),
                    walkingTime + (transfer ? edgeDuration : 0),
                    busTime + (tripStep && lineType == TransportLineType.Bus ? edgeDuration : 0),
                    tramTime + (tripStep && lineType == TransportLineType.Tramway ? edgeDuration : 0),
                    subwayTime + (tripStep && lineType == TransportLineType.Subway ? edgeDuration : 0)
            );
        }

        @Override
        public String toString() {
            return "State{" +
                    "currentTime=" + currentTime +
                    ", totalDuration=" + totalDuration +
                    ", transportStopCount=" + transportStopCount +
                    ", connectionCount=" + connectionCount +
                    ", firstWaitTime=" + firstWaitTime +
                    ", waitTime=" + waitTime +
                    ", walkingTime=" + walkingTime +
                    ", busTime=" + busTime +
                    ", tramTime=" + tramTime +
                    ", subwayTime=" + subwayTime +
                    '}';
        }
    }

    private Route buildRoute(LocalDateTime startTime, Path<TransitEdge> path) {
        if (path.getEdges().isEmpty()) return null;

        List<RouteStep> steps = new ArrayList<>();

        LocalDateTime time = null;
        LinkedList<TransitEdge> nonTimedEdges = new LinkedList<>();
        TransitEdge lastTransportEdge = null;
        for (TransitEdge edge : path.getEdges()) {
            switch (edge.type) {
                case TripWait:
                    if (lastTransportEdge != null && lastTransportEdge.target().stop.equals(edge.source().stop)) {
                        steps.add(new ConnectionStep(
                                0,
                                edge.source().stop,
                                edge.source().stop,
                                time,
                                time
                        ));
                    }
                    lastTransportEdge = null;

                    time = toLocalDateTime(((TransitTripWaitEdge) edge).getDepartureTime());

                    LocalDateTime oldTime = time;
                    while (!nonTimedEdges.isEmpty()) {
                        TransitEdge nonTimedEdge = nonTimedEdges.removeLast();

                        // There was transfer edges before the first tripWait
                        // Compute times in reverse
                        LocalDateTime previousTime = oldTime.minus(nonTimedEdge.walkingTime(), ChronoUnit.SECONDS);
                        steps.add(0, new ConnectionStep(
                                nonTimedEdge.distance(),
                                nonTimedEdge.source().stop,
                                nonTimedEdge.target().stop,
                                previousTime,
                                oldTime
                        ));
                        oldTime = previousTime;
                    }
                    break;
                case TripStep:
                    assert lastTransportEdge == null ||
                            ((TransitTripStepEdge) lastTransportEdge).getTrip()
                                    .equals(((TransitTripStepEdge) edge).getTrip());

                    steps.add(new TransportStep(
                            ((TransitTripStepEdge) edge).getTrip().getRoute(),
                            ((TransitTripStepEdge) edge).getTrip().getHeadSign(),
                            edge.source().stop,
                            edge.target().stop,
                            toLocalDateTime(((TransitTripStepEdge) edge).getDepartureTime()),
                            time = toLocalDateTime(((TransitTripStepEdge) edge).getArrivalTime())
                    ));
                    lastTransportEdge = edge;
                    break;
                case Transfer:
                    if (time == null) {
                        nonTimedEdges.add(edge);
                    } else {
                        steps.add(new ConnectionStep(
                                edge.distance(),
                                edge.source().stop,
                                edge.target().stop,
                                time,
                                time = time.plus(edge.walkingTime(), ChronoUnit.SECONDS)
                        ));
                    }

                    break;
                case Immediate:
                case Timed:
                    break;
            }
        }

        // There was only transfer edges
        // Compute times from start time
        time = startTime;
        while (!nonTimedEdges.isEmpty()) {
            TransitEdge nonTimedEdge = nonTimedEdges.removeFirst();

            steps.add(new ConnectionStep(
                    nonTimedEdge.distance(),
                    nonTimedEdge.source().stop,
                    nonTimedEdge.target().stop,
                    time,
                    time = time.plus(nonTimedEdge.walkingTime(), ChronoUnit.SECONDS)
            ));
        }

        return new Route(steps);
    }

    private LocalDateTime toLocalDateTime(long time) {
        return LocalDate.now().atStartOfDay().plus(time, ChronoUnit.SECONDS);
    }

    private class ProgressMonitorAdapter implements Consumer<TransitNode> {

        private final Consumer<Double> progressMonitor;
        private final TransitNode startNode;
        private final TransitNode goalNode;
        private int maxRoutes;

        private int routesDone = -1;
        private double routeProgress = 0;

        ProgressMonitorAdapter(Consumer<Double> delegate, TransitNode startNode, TransitNode goalNode, int maxRoutes) {
            this.progressMonitor = delegate;
            this.startNode = startNode;
            this.goalNode = goalNode;
            this.maxRoutes = maxRoutes;
        }

        void startNewRoute() {
            routesDone++;
        }

        @Override
        public void accept(TransitNode node) {
            double averageProgress =
                    graph.getAverageTransportTime(startNode, node)
                            / graph.getAverageTransportTime(startNode, goalNode);
            routeProgress = Math.max(averageProgress, routeProgress);

            progressMonitor.accept((routesDone + routeProgress) / maxRoutes);
        }
    }
}
