package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.TransportLine;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Consumer;

public class TransitRouteStepNode extends TransitNode {

    private TransportLine route;
    private TransitTripEndEdge tripEndEdge;
    private TransitTripStepEdge tripStepEdge;

    TransitRouteStepNode(TransportLine route, StationStop stop) {
        super(TransitNodeType.RouteStep, stop);
        this.route = route;
    }

    public TransportLine getRoute() {
        return route;
    }

    void setTripEndEdge(TransitTripEndEdge edge) {
        tripEndEdge = edge;
    }

    void setTripStepEdge(TransitTripStepEdge edge) {
        tripStepEdge = edge;
    }

    @Override
    public void forEachEdgeAfter(LocalDateTime time, Consumer<TransitEdge> edgeConsumer) {
        edgeConsumer.accept(tripEndEdge);

        if (tripStepEdge != null) edgeConsumer.accept(tripStepEdge);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransitRouteStepNode that = (TransitRouteStepNode) o;
        return route.equals(that.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), route);
    }

    @Override
    public String toString() {
        return super.toString() + " {ROUTE " + route.getShortName() + "}";
    }
}
