package fr.univ.amu.sin4u05.igl.transit.gtfs;

import fr.univ.amu.sin4u05.igl.routes.TransportLine;
import fr.univ.amu.sin4u05.igl.routes.TransportLineType;

import java.util.*;

public class GTFSRoute extends TransportLine {

    private final List<GTFSTrip> trips = new ArrayList<>();

    GTFSRoute(String shortName, String name, TransportLineType type) {
        super(shortName, name, type);
    }

    public List<GTFSTrip> getTrips() {
        return trips;
    }

    void addTrip(GTFSTrip route) {
        this.trips.add(route);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
