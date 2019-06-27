package fr.univ.amu.sin4u05.igl.routes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;

/**
 * This interface provides a way to query for routes between two stations of the transport network.
 * <p>
 * This interface must be implemented by the backend for the use of the frontend of the application.
 */
public interface RouteSearch {

    /**
     * Searches for a route from the station {@code startStation} to the station {@code goalStation} at the time
     * specified by {@code startTime}.
     *
     * @param startTime    the time after which the searched route must be available.
     * @param startStation the start station to start the searched route from.
     * @param goalStation  the goal station to reach with the searched route.
     * @return a route that allows to travel from {@code startStation} to {@code goalStation}.
     */
    Route search(LocalDateTime startTime,
                 Station startStation,
                 Station goalStation);

    /**
     * Searches for multiple routes from the station {@code startStation} to the station {@code goalStation} at the
     * time specified by {@code startTime}.
     *
     * @param startTime    the time after which the searched route must be available.
     * @param startStation the start station to start the searched route from.
     * @param goalStation  the goal station to reach with the searched route.
     * @param maxRoutes    the number of routes to search for.
     * @return a route that allows to travel from {@code startStation} to {@code goalStation}.
     */
    List<Route> search(LocalDateTime startTime,
                       Station startStation,
                       Station goalStation,
                       int maxRoutes);

    /**
     * Searches for a route from the station {@code startStation} to the station {@code goalStation} at the time
     * specified by {@code startTime}. The provided {@code progressMonitor} allows to track the progression of the
     * route search (a real number going from {@code 0.0} when the search starts to {@code 1.0} when the search is
     * done).
     *
     * @param startTime       the time after which the searched route must be available.
     * @param startStation    the start station to start the searched route from.
     * @param goalStation     the goal station to reach with the searched route.
     * @param progressMonitor a progress monitor to track the route search.
     * @return a route that allows to travel from {@code startStation} to {@code goalStation}.
     */
    Route search(LocalDateTime startTime,
                 Station startStation,
                 Station goalStation,
                 Consumer<Double> progressMonitor);

    /**
     * Searches for multiple routes from the station {@code startStation} to the station {@code goalStation} at the
     * time specified by {@code startTime}. The provided {@code progressMonitor} allows to track the progression of the
     * route search (a real number going from {@code 0.0} when the search starts to {@code 1.0} when the search for all
     * the routes is done).
     *
     * @param startTime       the time after which the searched route must be available.
     * @param startStation    the start station to start the searched route from.
     * @param goalStation     the goal station to reach with the searched route.
     * @param maxRoutes       the number of routes to search for.
     * @param progressMonitor a progress monitor to track the route search.
     * @return a route that allows to travel from {@code startStation} to {@code goalStation}.
     */
    List<Route> search(LocalDateTime startTime,
                       Station startStation,
                       Station goalStation,
                       int maxRoutes,
                       Consumer<Double> progressMonitor);
}
