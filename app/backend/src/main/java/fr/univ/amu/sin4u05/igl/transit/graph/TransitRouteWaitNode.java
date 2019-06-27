package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.TransportLine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.Consumer;

public class TransitRouteWaitNode extends TransitNode {

    private TransportLine route;
    private TreeMap<Integer, List<TransitTripWaitEdge>> tripWaitEdges = new TreeMap<>();

    TransitRouteWaitNode(TransportLine route, StationStop stop) {
        super(TransitNodeType.RouteWait, stop);
        this.route = route;
    }

    void addTripWaitEdge(TransitTripWaitEdge edge) {
        tripWaitEdges.computeIfAbsent(edge.getDepartureTime(), t -> new ArrayList<>()).add(edge);
    }

    @Override
    public void forEachEdgeAfter(LocalDateTime time, Consumer<TransitEdge> edgeConsumer) {
        int secondOfDay = time.toLocalTime().toSecondOfDay();
        findEdge: for (List<TransitTripWaitEdge> edges : tripWaitEdges.tailMap(secondOfDay).values()) {
            for (TransitTripWaitEdge edge : edges) {
                if (edge.isProvided(time.toLocalDate())) {
                    edgeConsumer.accept(edge);
                    break findEdge;
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransitRouteWaitNode that = (TransitRouteWaitNode) o;
        return route.equals(that.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), route);
    }

    @Override
    public String toString() {
        return super.toString() + " {WAIT  " + route.getShortName() + "}";
    }
}
