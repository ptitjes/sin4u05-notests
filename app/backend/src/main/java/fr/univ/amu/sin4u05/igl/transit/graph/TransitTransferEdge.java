package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSTransfer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TransitTransferEdge extends TransitEdge {

    private final GTFSTransfer transfer;
    private TransitNode source;
    private TransitNode target;

    TransitTransferEdge(GTFSTransfer transfer, TransitNode source, TransitNode target) {
        super(TransitEdgeType.Transfer);
        this.transfer = transfer;
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
        return currentTime.plus(walkingTime(), ChronoUnit.SECONDS);
    }

    @Override
    public String toString() {
        return source() + " -> " + target() + " Transfer(time=" + walkingTime() + "s)";
    }
}
