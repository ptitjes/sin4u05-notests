package fr.univ.amu.sin4u05.igl.transit.graph;

import java.time.LocalDateTime;

public class TransitImmediateEdge extends TransitEdge {

    private final TransitNode source;
    private final TransitNode target;

    TransitImmediateEdge(TransitNode source, TransitNode target) {
        super(TransitEdgeType.Immediate);
        this.source = source;
        this.target = target;
    }

    @Override
    public TransitNode source() {
        return source;
    }

    @Override
    public TransitNode target() {
        return target;
    }

    @Override
    public LocalDateTime traverse(LocalDateTime startTime, LocalDateTime currentTime) {
        return currentTime;
    }

    @Override
    public String toString() {
        return source() + " -> " + target();
    }
}
