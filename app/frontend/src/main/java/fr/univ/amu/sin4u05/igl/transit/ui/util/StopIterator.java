package fr.univ.amu.sin4u05.igl.transit.ui.util;

import fr.univ.amu.sin4u05.igl.routes.*;

import java.time.LocalDateTime;
import java.util.List;

public class StopIterator {

    private final List<RouteStep> steps;
    private final int size;
    private int index = -1;

    public StopIterator(List<RouteStep> steps) {
        this.steps = steps;
        size = steps.size();
    }

    public boolean next() {
        if (index <= size) index++;
        return index <= size;
    }

    public boolean isFirst() {
        return index == 0;
    }

    public boolean isLast() {
        return index == size;
    }

    public StationStop current() {
        return index == 0 ? steps.get(0).getDepartureStop() :
                index > 0 && index <= size ? steps.get(index - 1).getArrivalStop() : null;
    }

    public RouteStep ingoingStep() {
        return index > 0 && index <= size ? steps.get(index - 1) : null;
    }

    public RouteStep outgoingStep() {
        return index >= 0 && index < size ? steps.get(index) : null;
    }

    public LocalDateTime arrivalTime() {
        RouteStep step = ingoingStep();
        return step != null ? step.getArrivalTime() : null;
    }

    public LocalDateTime departureTime() {
        RouteStep step = outgoingStep();
        return step != null ? step.getDepartureTime() : null;
    }

    public boolean hasIngoingConnection() {
        RouteStep ingoingStep = ingoingStep();
        return ingoingStep != null && ingoingStep.getType() == RouteStepType.Connection;
    }

    public boolean hasOutgoingTransport() {
        RouteStep outgoingStep = outgoingStep();
        return outgoingStep != null && outgoingStep.getType() == RouteStepType.Transport;
    }

    public TransportStep outgoingTransport() {
        RouteStep outgoingStep = outgoingStep();
        return outgoingStep != null && outgoingStep.getType() == RouteStepType.Transport ?
                (TransportStep) outgoingStep : null;
    }

    public TransportLine transportLine() {
        RouteStep ingoingStep = ingoingStep();
        RouteStep outgoingStep = outgoingStep();
        return ingoingStep != null && ingoingStep.getType() == RouteStepType.Transport ?
                ((TransportStep) ingoingStep).getLine() :
                outgoingStep != null && outgoingStep.getType() == RouteStepType.Transport ?
                        ((TransportStep) outgoingStep).getLine() :
                        null;
    }
}
