package fr.univ.amu.sin4u05.igl.transit.gtfs;

import fr.univ.amu.sin4u05.igl.routes.StationStop;

public class GTFSStopTime {

    private final StationStop stop;
    private final int arrivalTime;
    private final int departureTime;

    GTFSStopTime(StationStop stop, int arrivalTime, int departureTime) {
        this.stop = stop;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public StationStop getStop() {
        return stop;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }
}
