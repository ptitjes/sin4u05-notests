package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.transit.Constants;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataSet;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSTransfer;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSTrip;
import fr.univ.amu.sin4u05.igl.util.Coordinates;

import java.time.LocalDateTime;

public abstract class TransitEdge {

    public static TransitImmediateEdge immediate(TransitNode source, TransitNode target) {
        return new TransitImmediateEdge(source, target);
    }

    public static TransitTripWaitEdge tripWait(GTFSDataSet dataSet, GTFSTrip route, int departureTime, TransitNode source, TransitNode target) {
        return new TransitTripWaitEdge(dataSet, route, departureTime, source, target);
    }

    public static TransitTripStepEdge tripStep(GTFSDataSet dataSet, GTFSTrip route, int departureTime, int arrivalTime, TransitNode source, TransitNode target) {
        return new TransitTripStepEdge(dataSet, route, departureTime, arrivalTime, source, target);
    }

    public static TransitTripEndEdge tripEnd(TransitNode source, TransitNode target) {
        return new TransitTripEndEdge(source, target);
    }

    public static TransitTransferEdge transfer(GTFSTransfer transfer, TransitNode source, TransitNode target) {
        return new TransitTransferEdge(transfer, source, target);
    }

    public final TransitEdgeType type;

    TransitEdge(TransitEdgeType type) {
        this.type = type;
    }

    public abstract TransitNode source();

    public abstract TransitNode target();

    public abstract LocalDateTime traverse(LocalDateTime startTime, LocalDateTime currentTime);

    public double distance() {
        return Coordinates.distance(source().getCoordinates(), target().getCoordinates());
    }

    public int walkingTime() {
        return ((int) Math.ceil(distance() / Constants.AVERAGE_WALKING_SPEED / 60) * 60);
    }
}
