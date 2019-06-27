package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataSet;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSTrip;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TransitTripWaitEdge extends TransitEdge {

    private final GTFSDataSet dataSet;
    private final GTFSTrip trip;
    private final int departureTime;
    private final TransitNode source;
    private final TransitNode target;

    TransitTripWaitEdge(GTFSDataSet dataSet, GTFSTrip trip, int departureTime, TransitNode source, TransitNode target) {
        super(TransitEdgeType.TripWait);
        this.dataSet = dataSet;
        this.trip = trip;
        this.departureTime = departureTime;
        this.source = source;
        this.target = target;
    }

    public GTFSTrip getTrip() {
        return trip;
    }

    @Override
    public TransitNode source() {
        return source;
    }

    @Override
    public TransitNode target() {
        return target;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public boolean isProvided(LocalDate date) {
        return dataSet.isServiceProvided(trip.getServiceId(), date);
    }

    @Override
    public LocalDateTime traverse(LocalDateTime startTime, LocalDateTime currentTime) {
        LocalDateTime startDate = startTime.toLocalDate().atStartOfDay();
        LocalDateTime departure = startDate.plus(getDepartureTime(), ChronoUnit.SECONDS);

        if (!isProvided(departure.toLocalDate())) return null;

        return currentTime.isAfter(departure) ? null : departure;
    }

    @Override
    public String toString() {
        return source() + " -> " + target() + " TRIP WAIT " + formatTime(departureTime) + " " + trip;
    }

    private static String formatTime(long time) {
        LocalDateTime localTime = LocalDate.now().atStartOfDay().plus(time, ChronoUnit.SECONDS);
        return localTime.toLocalTime().toString();
    }
}
