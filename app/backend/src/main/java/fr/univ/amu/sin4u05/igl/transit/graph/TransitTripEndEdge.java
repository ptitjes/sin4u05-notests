package fr.univ.amu.sin4u05.igl.transit.graph;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TransitTripEndEdge extends TransitEdge {

    private final static long GET_OFF_DURATION = 10;

    private final TransitNode source;
    private final TransitNode target;

    TransitTripEndEdge(TransitNode source, TransitNode target) {
        super(TransitEdgeType.Timed);
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
        return currentTime.plus(GET_OFF_DURATION, ChronoUnit.SECONDS);
    }

    @Override
    public String toString() {
        return source() + " -> " + target() + " TRIP END";
    }
}
