package fr.univ.amu.sin4u05.igl.routes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A connection route step is a route step that must be travelled by walking.
 */
public class ConnectionStep extends RouteStep {

    private final double distance;

    /**
     * Constructs a new {@code ConnectionStep} with the specified characteristics.
     *
     * @param distance      the distance to travel.
     * @param departureStop the departure stop.
     * @param arrivalStop   the arrival stop.
     * @param departureTime the departure time.
     * @param arrivalTime   the arrival time.
     */
    public ConnectionStep(double distance,
                          StationStop departureStop, StationStop arrivalStop,
                          LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this(distance, departureStop, arrivalStop, departureTime, arrivalTime, null);
    }

    /**
     * Constructs a new {@code ConnectionStep} with the specified characteristics.
     *
     * @param distance      the distance to travel.
     * @param departureStop the departure stop.
     * @param arrivalStop   the arrival stop.
     * @param departureTime the departure time.
     * @param arrivalTime   the arrival time.
     * @param stepDetails   the list of detailed steps of this step.
     */
    public ConnectionStep(double distance,
                          StationStop departureStop, StationStop arrivalStop,
                          LocalDateTime departureTime, LocalDateTime arrivalTime,
                          List<RouteStep> stepDetails) {

        super(RouteStepType.Connection, departureStop, arrivalStop, departureTime, arrivalTime, stepDetails);
        this.distance = distance;
    }

    /**
     * Returns the distance to travel on foot.
     *
     * @return the distance to travel (in meters).
     */
    public double getDistance() {
        return distance;
    }

    @Override
    protected boolean canMerge(RouteStep other) {
        return other.getType() == RouteStepType.Connection;
    }

    @Override
    protected RouteStep merge(RouteStep other) {
        ConnectionStep that = (ConnectionStep) other;

        List<RouteStep> stepDetails = new ArrayList<>();
        stepDetails.addAll(getStepDetails());
        stepDetails.addAll(that.getStepDetails());

        return new ConnectionStep(this.distance + that.distance,
                getDepartureStop(), that.getArrivalStop(),
                getDepartureTime(), that.getArrivalTime(),
                stepDetails);
    }

    /**
     * Compares this connection step to the specified object. The result is {@code true} if and only if the argument is
     * not {@code null} and is a {@code ConnectionStep} object with the same distance.
     *
     * @param o the object to compare this {@code ConnectionStep} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConnectionStep that = (ConnectionStep) o;
        return Double.compare(that.distance, distance) == 0;
    }

    /**
     * Returns a hash code for this connection step. The hash code of a connection step is the hash code of its
     * superclass and distance.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), distance);
    }

    /**
     * Returns a string representation of this {@code ConnectionStep} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return "" + getDepartureTime().toLocalTime().toString() +
                " -> " + getArrivalTime().toLocalTime().toString() +
                ", walk from " + getDepartureStop() + " to " + getArrivalStop() +
                " (" + Math.round(getDistance()) + " m, " + getDuration().toMinutes() + " min)";
    }
}
