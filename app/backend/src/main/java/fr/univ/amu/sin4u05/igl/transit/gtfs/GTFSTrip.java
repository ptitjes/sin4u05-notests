package fr.univ.amu.sin4u05.igl.transit.gtfs;

import fr.univ.amu.sin4u05.igl.routes.StationStop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GTFSTrip {

    private final long tripId;
    private final GTFSRoute route;
    private final String serviceId;
    private final String headSign;
    private final List<GTFSStopTime> stopTimes = new ArrayList<>();

    GTFSTrip(String serviceId, GTFSRoute route, long tripId, String headSign) {
        this.tripId = tripId;
        this.route = route;
        this.serviceId = serviceId;
        this.headSign = headSign;
    }

    public GTFSRoute getRoute() {
        return route;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getHeadSign() {
        return headSign;
    }

    public List<GTFSStopTime> getStopTimes() {
        return stopTimes;
    }

    void addStop(StationStop stop, int arrivalTime, int departureTime) {
        this.stopTimes.add(new GTFSStopTime(stop, arrivalTime, departureTime));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GTFSTrip that = (GTFSTrip) o;
        return tripId == that.tripId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripId);
    }

    @Override
    public String toString() {
        return "" + route + " > " + headSign + "(" + tripId + "/" + serviceId + ")";
    }
}
