package fr.univ.amu.sin4u05.igl.routes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A route from one station to another station, as computed by {@link RouteSearch}.
 */
@SuppressWarnings("WeakerAccess")
public class Route {

    private final List<RouteStep> steps;

    /**
     * Constructs a new {@code Route} with the specified list of route steps.
     *
     * @param steps the list of route steps.
     */
    public Route(List<RouteStep> steps) {
        assert steps != null && !steps.isEmpty();
        this.steps = Collections.unmodifiableList(steps);
    }

    /**
     * Returns the departure stop of the route.
     *
     * @return the departure stop of the route.
     */
    public StationStop getDepartureStop() {
        return steps.get(0).getDepartureStop();
    }

    /**
     * Returns the arrival stop of the route.
     *
     * @return the arrival stop of the route.
     */
    public StationStop getArrivalStop() {
        return steps.get(steps.size() - 1).getArrivalStop();
    }

    /**
     * Returns the departure time of the route.
     *
     * @return the departure time of the route.
     */
    public LocalDateTime getDepartureTime() {
        return steps.get(0).getDepartureTime();
    }

    /**
     * Returns the arrival time of this route.
     *
     * @return the arrival time of the route.
     */
    public LocalDateTime getArrivalTime() {
        return steps.get(steps.size() - 1).getArrivalTime();
    }

    /**
     * Returns the list of steps of the route.
     *
     * @return the list of steps of the route.
     */
    public List<RouteStep> getSteps() {
        return steps;
    }

    /**
     * Returns the duration of this route.
     *
     * @return the duration of the route.
     */
    public Duration getDuration() {
        return Duration.between(getDepartureTime(), getArrivalTime());
    }

    /**
     * Computes a compressed view of the route. It is computed by collapsing steps that of the same types and that use
     * the same transport lines.
     *
     * @return the compressed view of the route.
     */
    public Route compressRoute() {
        List<RouteStep> compressedSteps = new ArrayList<>();

        RouteStep lastStep = null;
        for (RouteStep step : steps) {
            if (lastStep != null && lastStep.canMerge(step)) {
                lastStep = lastStep.merge(step);
            } else {
                if (lastStep != null) compressedSteps.add(lastStep);
                lastStep = step;
            }
        }
        if (lastStep != null) compressedSteps.add(lastStep);

        return new Route(compressedSteps);
    }

    /**
     * Compares this route to the specified object. The result is {@code true} if and only if the argument is not
     * {@code null} and is a {@code Route} object with the same steps.
     *
     * @param o the object to compare this {@code Route} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return steps.equals(route.steps);
    }

    /**
     * Returns a hash code for this route. The hash code of a route is the hash code of its steps.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(steps);
    }

    /**
     * Returns a string representation of this {@code Route} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return steps.stream().reduce("", (acc, step) -> acc + step.toString() + "\n", (s1, s2) -> s1 + s2);
    }
}
