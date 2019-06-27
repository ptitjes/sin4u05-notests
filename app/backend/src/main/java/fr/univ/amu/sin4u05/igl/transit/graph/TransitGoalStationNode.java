package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.Station;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class TransitGoalStationNode extends TransitNode {

    private Station station;

    TransitGoalStationNode(Station station, StationStop stop) {
        super(TransitNodeType.GoalStation, stop);
        this.station = station;
    }

    public Station getStation() {
        return station;
    }

    @Override
    public void forEachEdgeAfter(LocalDateTime time, Consumer<TransitEdge> edgeConsumer) {
        // Nothing to do
    }

    @Override
    public String toString() {
        return station.getName() + " [GOAL]";
    }
}
