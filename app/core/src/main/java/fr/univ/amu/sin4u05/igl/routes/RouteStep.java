package fr.univ.amu.sin4u05.igl.routes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * An individual route step between two neighbor stations, as computed by {@link RouteSearch}.
 */
@SuppressWarnings("WeakerAccess")
public abstract class RouteStep {

    private final RouteStepType type;
    private final StationStop departureStop;
    private final StationStop arrivalStop;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;
    private final List<RouteStep> stepDetails;

    RouteStep(RouteStepType type,
              StationStop departureStop, StationStop arrivalStop,
              LocalDateTime departureTime, LocalDateTime arrivalTime,
              List<RouteStep> stepDetails) {

        this.type = type;
        this.departureStop = departureStop;
        this.arrivalStop = arrivalStop;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.stepDetails = stepDetails;
    }

    /**
     * Returns the type of the route step (i.e. either a connection or a transport step). Depending on its type, the
     * route step can safely be cast to either {@link ConnectionStep} or {@link TransportStep}.
     *
     * @return the type of the route step.
     */
    public RouteStepType getType() {
        return type;
    }

    /**
     * Returns the departure stop of the route step.
     *
     * @return the departure stop of the route step.
     */
    public StationStop getDepartureStop() {
        return departureStop;
    }

    /**
     * Returns the arrival stop of the route step.
     *
     * @return the arrival stop of the route step.
     */
    public StationStop getArrivalStop() {
        return arrivalStop;
    }

    /**
     * Returns the departure time of the route step.
     *
     * @return the departure time of the route step.
     */
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    /**
     * Returns the arrival time of this route step.
     *
     * @return the arrival time of the route step.
     */
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Returns the duration of this route step.
     *
     * @return the duration of the route step.
     */
    public Duration getDuration() {
        return Duration.between(getDepartureTime(), getArrivalTime());
    }

    /**
     * Returns the details of this route step.
     *
     * @return the list of detailed steps of this step.
     */
    public List<RouteStep> getStepDetails() {
        return stepDetails != null ? stepDetails : Collections.singletonList(this);
    }

    protected abstract boolean canMerge(RouteStep other);

    protected abstract RouteStep merge(RouteStep other);

    /**
     * Compares this route step to the specified object. The result is {@code true} if and only if the argument is not
     * {@code null} and is a {@code RouteStep} object with the same type, departure and arrival stops, departure and
     * arrival times, and step details.
     *
     * @param o the object to compare this {@code RouteStep} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteStep routeStep = (RouteStep) o;
        return type == routeStep.type &&
                departureStop.equals(routeStep.departureStop) &&
                arrivalStop.equals(routeStep.arrivalStop) &&
                departureTime.equals(routeStep.departureTime) &&
                arrivalTime.equals(routeStep.arrivalTime) &&
                Objects.equals(stepDetails, routeStep.stepDetails);
    }

    /**
     * Returns a hash code for this route step. The hash code of a route step is the hash code of its type, departure
     * and arrival stops, departure and arrival times, and step details.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, departureStop, arrivalStop, departureTime, arrivalTime, stepDetails);
    }
}
