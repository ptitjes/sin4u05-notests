package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.Station;
import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.TransportLine;
import fr.univ.amu.sin4u05.igl.transit.gtfs.*;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TransitGraph {

    private final static int STATISTICS = 0;
    private Statistics statistics = new Statistics();

    private final Map<Station, TransitStartStationNode> startNodeByStation = new HashMap<>();
    private final Map<Station, TransitGoalStationNode> goalNodeByStation = new HashMap<>();

    private double averageTransportSpeed;

    public TransitGraph(GTFSDataSet dataSet) {

        Map<StationStop, TransitWaitNode> waitNodeByStop = new HashMap<>();

        for (Station station : dataSet.getAllStations()) {
            StationStop anyStop = station.getStops().iterator().next();

            TransitStartStationNode startNode = createStartNode(station, anyStop);
            TransitGoalStationNode goalNode = createGoalNode(station, anyStop);
            startNodeByStation.put(station, startNode);
            goalNodeByStation.put(station, goalNode);

            for (StationStop stop : station.getStops()) {
                TransitWaitNode waitNode = waitNodeByStop.computeIfAbsent(stop, this::createStationWaitNode);

                startNode.add(createImmediateEdge(startNode, waitNode));
                waitNode.setWaitEndEdge(createImmediateEdge(waitNode, goalNode));
            }
        }

        long sumTimes = 0;
        double sumDistances = 0;

        Map<RouteStopPair, TransitRouteWaitNode> tripWaitNodeByRouteAndStop = new HashMap<>();
        Map<TripStopPair, TransitRouteStepNode> stopNodeByRouteAndStop = new HashMap<>();

        for (GTFSRoute route : dataSet.getRoutes()) {
            for (GTFSTrip trip : route.getTrips()) {

                GTFSStopTime lastStopTime = null;
                TransitRouteStepNode lastStopNode = null;
                for (GTFSStopTime stopTime : trip.getStopTimes()) {
                    int arrivalTime = stopTime.getArrivalTime();

                    TransitWaitNode waitNode = waitNodeByStop.get(stopTime.getStop());

                    TransitRouteWaitNode tripWaitNode = tripWaitNodeByRouteAndStop.computeIfAbsent(
                            new RouteStopPair(route, stopTime.getStop()),
                            (p) -> {
                                TransitRouteWaitNode node = createRouteWaitNode(route, stopTime);
                                waitNode.addTripStartEdge(createImmediateEdge(waitNode, node));
                                return node;
                            }
                    );

                    TransitRouteStepNode stopNode = stopNodeByRouteAndStop.computeIfAbsent(
                            new TripStopPair(trip, stopTime.getStop()),
                            (p) -> {
                                TransitRouteStepNode node = createRouteStepNode(route, stopTime);
                                node.setTripEndEdge(createTripEndEdge(waitNode, node));
                                return node;
                            }
                    );

                    tripWaitNode.addTripWaitEdge(createTripWaitEdge(dataSet, trip, arrivalTime, tripWaitNode, stopNode));

                    if (lastStopNode != null) {
                        int lastDepartureTime = lastStopTime.getDepartureTime();
                        lastStopNode.setTripStepEdge(createTripStepEdge(dataSet, trip, lastStopNode, arrivalTime, stopNode, lastDepartureTime));

                        sumTimes += arrivalTime - lastDepartureTime;
                        sumDistances += stopTime.getStop().getCoordinates().distanceTo(lastStopNode.getCoordinates());
                    }

                    lastStopTime = stopTime;
                    lastStopNode = stopNode;
                }
            }
        }

        this.averageTransportSpeed = sumDistances / sumTimes;

        for (GTFSTransfer transfer : dataSet.getTransfers()) {
            TransitWaitNode source = waitNodeByStop.get(transfer.getFrom());
            TransitWaitNode target = waitNodeByStop.get(transfer.getTo());

            source.addTransferEdge(createTransferEdge(transfer, source, target));
            target.addTransferEdge(createTransferEdge(transfer, target, source));
        }

        if (STATISTICS > 0) {
            System.out.println(statistics);
        }
    }

    public TransitNode getStartNodeFor(Station station) {
        return startNodeByStation.get(station);
    }

    public TransitNode getGoalNodeFor(Station station) {
        return goalNodeByStation.get(station);
    }

    public double getAverageTransportTime(TransitNode n1, TransitNode n2) {
        double distance = n1.getCoordinates().distanceTo(n2.getCoordinates());
        return distance / averageTransportSpeed;
    }

    private static class RouteStopPair {

        final TransportLine line;
        final StationStop stop;

        RouteStopPair(TransportLine line, StationStop stop) {
            this.line = line;
            this.stop = stop;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RouteStopPair that = (RouteStopPair) o;
            return line.equals(that.line) &&
                    stop.equals(that.stop);
        }

        @Override
        public int hashCode() {
            return Objects.hash(line, stop);
        }
    }

    private static class TripStopPair {

        final GTFSTrip trip;
        final StationStop stop;

        TripStopPair(GTFSTrip trip, StationStop stop) {
            this.trip = trip;
            this.stop = stop;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TripStopPair that = (TripStopPair) o;
            return trip.equals(that.trip) &&
                    stop.equals(that.stop);
        }

        @Override
        public int hashCode() {
            return Objects.hash(trip, stop);
        }
    }

    @NotNull
    private TransitStartStationNode createStartNode(Station station, StationStop anyStop) {
        if (STATISTICS > 0) statistics.startNodeCount++;
        return new TransitStartStationNode(station, anyStop);
    }

    @NotNull
    private TransitGoalStationNode createGoalNode(Station station, StationStop anyStop) {
        if (STATISTICS > 0) statistics.goalNodeCount++;
        return new TransitGoalStationNode(station, anyStop);
    }

    @NotNull
    private TransitWaitNode createStationWaitNode(StationStop stop) {
        if (STATISTICS > 0) statistics.stationWaitNodeCount++;
        return new TransitWaitNode(stop);
    }

    @NotNull
    private TransitRouteWaitNode createRouteWaitNode(GTFSRoute route, GTFSStopTime stopTime) {
        if (STATISTICS > 0) statistics.routeWaitNodeCount++;
        return new TransitRouteWaitNode(route, stopTime.getStop());
    }

    @NotNull
    private TransitRouteStepNode createRouteStepNode(GTFSRoute route, GTFSStopTime stopTime) {
        if (STATISTICS > 0) statistics.routeStepNodeCount++;
        return new TransitRouteStepNode(route, stopTime.getStop());
    }

    @NotNull
    private TransitTransferEdge createTransferEdge(GTFSTransfer transfer, TransitNode source, TransitNode target) {
        if (STATISTICS > 0) statistics.transferEdgeCount++;
        return TransitEdge.transfer(transfer, source, target);
    }

    @NotNull
    private TransitTripWaitEdge createTripWaitEdge(GTFSDataSet dataSet, GTFSTrip trip, int arrivalTime,
                                                   TransitNode tripWaitNode, TransitNode stopNode) {
        if (STATISTICS > 0) statistics.tripWaitEdgeCount++;
        return TransitEdge.tripWait(dataSet, trip, arrivalTime, tripWaitNode, stopNode);
    }

    @NotNull
    private TransitTripStepEdge createTripStepEdge(GTFSDataSet dataSet, GTFSTrip trip,
                                                   TransitNode lastStopNode, int arrivalTime,
                                                   TransitNode stopNode, int lastDepartureTime) {
        if (STATISTICS > 0) statistics.tripStepEdgeCount++;
        return TransitEdge.tripStep(dataSet, trip, lastDepartureTime, arrivalTime, lastStopNode, stopNode);
    }

    @NotNull
    private TransitImmediateEdge createImmediateEdge(TransitNode waitNode, TransitNode node) {
        if (STATISTICS > 0) statistics.immediateEdgeCount++;
        return TransitEdge.immediate(waitNode, node);
    }

    @NotNull
    private TransitTripEndEdge createTripEndEdge(TransitNode waitNode, TransitNode node) {
        if (STATISTICS > 0) statistics.tripEndEdgeCount++;
        return TransitEdge.tripEnd(node, waitNode);
    }

    private static class Statistics {

        int startNodeCount = 0;
        int goalNodeCount = 0;
        int routeWaitNodeCount = 0;
        int routeStepNodeCount = 0;
        int stationWaitNodeCount = 0;

        int transferEdgeCount = 0;
        int tripWaitEdgeCount = 0;
        int tripStepEdgeCount = 0;
        int immediateEdgeCount = 0;
        int tripEndEdgeCount = 0;

        private int totalNodeCount() {
            return startNodeCount + goalNodeCount + routeWaitNodeCount + routeStepNodeCount + stationWaitNodeCount;
        }

        private int totalEdgeCount() {
            return transferEdgeCount + tripWaitEdgeCount + tripStepEdgeCount + immediateEdgeCount + tripEndEdgeCount;
        }

        @Override
        public String toString() {
            return "Statistics{" +
                    "startNodeCount=" + startNodeCount +
                    ", goalNodeCount=" + goalNodeCount +
                    ", routeWaitNodeCount=" + routeWaitNodeCount +
                    ", routeStepNodeCount=" + routeStepNodeCount +
                    ", stationWaitNodeCount=" + stationWaitNodeCount +
                    ", totalNodeCount=" + totalNodeCount() +
                    ", transferEdgeCount=" + transferEdgeCount +
                    ", tripStepEdgeCount=" + tripStepEdgeCount +
                    ", immediateEdgeCount=" + immediateEdgeCount +
                    ", tripEndEdgeCount=" + tripEndEdgeCount +
                    ", totalEdgeCount=" + totalEdgeCount() +
                    '}';
        }
    }
}
