package fr.univ.amu.sin4u05.igl.routes;

import java.util.Collection;
import java.util.List;

/**
 * A representation of the transport network.
 * <p>
 * This interface must be implemented by the backend for the use of the frontend of the application.
 */
public interface TransportNetwork {

    /**
     * Returns all the stations of the transport network.
     *
     * @return a list of all the stations, ordered alphabetically.
     */
    List<Station> getAllStations();

    /**
     * Finds a station by its name.
     *
     * @param name the name of the requested station.
     * @return the corresponding station, or {@code null} if there is no station with such a name.
     */
    Station getStationByName(String name);

    /**
     * A collection of all the stops of the transport network.
     *
     * @return a collection of all the stops, in no particular order.
     */
    Collection<StationStop> getAllStops();
}
