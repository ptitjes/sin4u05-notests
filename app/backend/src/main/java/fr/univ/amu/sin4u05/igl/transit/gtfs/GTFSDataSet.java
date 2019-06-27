package fr.univ.amu.sin4u05.igl.transit.gtfs;

import fr.univ.amu.sin4u05.igl.routes.Station;
import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.TransportNetwork;

import java.time.LocalDate;
import java.util.*;

public class GTFSDataSet implements TransportNetwork {

    private final Map<String, Station> stationsByName;
    private final Map<String, GTFSRoute> routesById;
    private final Map<Integer, StationStop> stopsById;
    private final List<GTFSTransfer> transfers;
    private final Map<String, GTFSCalendarData> calendarDataByServiceId;
    private final Map<String, GTFSCalendarDatesData> calendarDatesDataByServiceId;
    private final List<Station> stations;

    GTFSDataSet(Map<String, Station> stationsByName,
                Map<String, GTFSRoute> routesById,
                Map<Integer, StationStop> stopsById,
                List<GTFSTransfer> transfers,
                Map<String, GTFSCalendarData> calendarDataByServiceId,
                Map<String, GTFSCalendarDatesData> calendarDatesDataByServiceId) {

        this.stationsByName = stationsByName;
        this.routesById = routesById;
        this.stopsById = stopsById;
        this.transfers = transfers;
        this.calendarDataByServiceId = calendarDataByServiceId;
        this.calendarDatesDataByServiceId = calendarDatesDataByServiceId;

        stations = new ArrayList<>(stationsByName.values());
        stations.sort(Comparator.comparing(Station::getName));
    }

    @Override
    public List<Station> getAllStations() {
        return this.stations;
    }

    @Override
    public Station getStationByName(String name) {
        return stationsByName.get(name);
    }

    @Override
    public Collection<StationStop> getAllStops() {
        return stopsById.values();
    }

    StationStop getStopById(int id) {
        return stopsById.get(id);
    }

    GTFSRoute getRooteById(String id) {
        return routesById.get(id);
    }

    public List<GTFSTransfer> getTransfers() {
        return transfers;
    }

    public Collection<GTFSRoute> getRoutes() {
        return routesById.values();
    }

    public boolean isServiceProvided(String serviceId, LocalDate date) {
        GTFSCalendarData calendarData = calendarDataByServiceId.get(serviceId);
        GTFSCalendarDatesData calendarDatesData = calendarDatesDataByServiceId.get(serviceId);
        return calendarData.isServiceProvided(date) &&
                (calendarDatesData == null || calendarDatesData.isServiceProvided(date));
    }
}
