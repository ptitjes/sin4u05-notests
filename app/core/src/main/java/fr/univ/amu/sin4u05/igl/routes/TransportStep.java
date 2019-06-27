package fr.univ.amu.sin4u05.igl.routes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A transport route step is a route step that must be travelled on a transport line.
 */
public class TransportStep extends RouteStep {

    private final TransportLine line;
    private final String headSign;


    /**
     * Constructs a new {@code TransportStep} with the specified characteristics.
     *
     * @param line          the transport line to travel on.
     * @param headSign      the line direction to travel to.
     * @param departureStop the departure stop.
     * @param arrivalStop   the arrival stop.
     * @param departureTime the departure time.
     * @param arrivalTime   the arrival time.
     */
    public TransportStep(TransportLine line, String headSign,
                         StationStop departureStop, StationStop arrivalStop,
                         LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this(line, headSign, departureStop, arrivalStop, departureTime, arrivalTime, null);
    }

    /**
     * Constructs a new {@code TransportStep} with the specified characteristics.
     *
     * @param line          the transport line to travel on.
     * @param headSign      the line direction to travel to.
     * @param departureStop the departure stop.
     * @param arrivalStop   the arrival stop.
     * @param departureTime the departure time.
     * @param arrivalTime   the arrival time.
     * @param stepDetails   the list of detailed steps of this step.
     */
    public TransportStep(TransportLine line, String headSign,
                         StationStop departureStop, StationStop arrivalStop,
                         LocalDateTime departureTime, LocalDateTime arrivalTime,
                         List<RouteStep> stepDetails) {

        super(RouteStepType.Transport, departureStop, arrivalStop, departureTime, arrivalTime, stepDetails);
        this.line = line;
        this.headSign = headSign;
    }

    /**
     * Returns the transport line to travel on.
     *
     * @return the transport line to travel on.
     */
    public TransportLine getLine() {
        return line;
    }

    /**
     * Returns the line direction to travel to.
     *
     * @return the line direction to travel to.
     */
    public String getHeadSign() {
        return headSign;
    }

    @Override
    protected boolean canMerge(RouteStep other) {
        if (other.getType() != RouteStepType.Transport) return false;
        TransportStep that = (TransportStep) other;
        return line.equals(that.line) &&
                headSign.equals(that.headSign) &&
                getArrivalStop().equals(that.getDepartureStop());
    }

    @Override
    protected RouteStep merge(RouteStep other) {
        TransportStep that = (TransportStep) other;

        List<RouteStep> stepDetails = new ArrayList<>();
        stepDetails.addAll(getStepDetails());
        stepDetails.addAll(that.getStepDetails());

        return new TransportStep(line, headSign,
                getDepartureStop(), that.getArrivalStop(),
                getDepartureTime(), that.getArrivalTime(),
                stepDetails);
    }

    /**
     * Compares this transport step to the specified object. The result is {@code true} if and only if the argument is
     * not {@code null} and is a {@code TransportStep} object with the same transport line and head sign.
     *
     * @param o the object to compare this {@code TransportStep} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransportStep that = (TransportStep) o;
        return line.equals(that.line) &&
                headSign.equals(that.headSign);
    }

    /**
     * Returns a hash code for this transport step. The hash code of a transport step is the hash code of its
     * superclass, line and head sign.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), line, headSign);
    }

    /**
     * Returns a string representation of this {@code TransportStep} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return "" + getDepartureTime().toLocalTime().toString() +
                " -> " + getArrivalTime().toLocalTime().toString() +
                ", take the " + getLine() + " (towards " + getHeadSign() +
                ") from " + getDepartureStop() + " to " + getArrivalStop();
    }
}
