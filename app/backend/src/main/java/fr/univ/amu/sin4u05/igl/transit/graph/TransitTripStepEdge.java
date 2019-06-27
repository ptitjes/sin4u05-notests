package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataSet;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSTrip;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TransitTripStepEdge extends TransitEdge {

    private final GTFSDataSet dataSet;
    private final GTFSTrip trip;
    private final int departureTime, arrivalTime;
    private final TransitNode source;
    private final TransitNode target;

    TransitTripStepEdge(GTFSDataSet dataSet, GTFSTrip trip, int departureTime, int arrivalTime, TransitNode source, TransitNode target) {
        super(TransitEdgeType.TripStep);
        this.dataSet = dataSet;
        this.trip = trip;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
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

    public GTFSTrip getTrip() {
        return trip;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public boolean isProvided(LocalDate date) {
        return dataSet.isServiceProvided(trip.getServiceId(), date);
    }

    @Override
    public LocalDateTime traverse(LocalDateTime startTime, LocalDateTime currentTime) {
        LocalDateTime startDate = startTime.toLocalDate().atStartOfDay();
        LocalDateTime departure = startDate.plus(getDepartureTime(), ChronoUnit.SECONDS);

        if (!isProvided(departure.toLocalDate())) return null;

        LocalDateTime arrival = startDate.plus(getArrivalTime(), ChronoUnit.SECONDS);
        return currentTime.isAfter(departure) ? null : arrival;
    }

    @Override
    public String toString() {
        return source() + " -> " + target() +
                " TRIP STEP " + formatTime(departureTime) + "-" + formatTime(arrivalTime) + " " + trip;
    }

    private static String formatTime(long time) {
        LocalDateTime localTime = LocalDate.now().atStartOfDay().plus(time, ChronoUnit.SECONDS);
        return localTime/*.toLocalTime()*/.toString();
    }
}
