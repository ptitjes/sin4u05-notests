package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.util.Coordinates;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Consumer;

public abstract class TransitNode {

    public final TransitNodeType type;
    public final StationStop stop;

    public TransitNode(TransitNodeType type, StationStop stop) {
        this.type = type;
        this.stop = stop;
    }

    public Coordinates getCoordinates() {
        return stop.getCoordinates();
    }

    public abstract void forEachEdgeAfter(LocalDateTime time, Consumer<TransitEdge> edgeConsumer);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransitNode that = (TransitNode) o;
        return type == that.type &&
                stop.equals(that.stop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, stop);
    }

    @Override
    public String toString() {
        return stop.toString();
    }
}
