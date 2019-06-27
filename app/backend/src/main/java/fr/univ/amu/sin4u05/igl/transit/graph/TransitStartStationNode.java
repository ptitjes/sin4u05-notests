package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.Station;
import fr.univ.amu.sin4u05.igl.routes.StationStop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TransitStartStationNode extends TransitNode {

    private Station station;
    private List<TransitImmediateEdge> startEdges = new ArrayList<>();

    TransitStartStationNode(Station station, StationStop stop) {
        super(TransitNodeType.StartStation, stop);
        this.station = station;
    }

    public Station getStation() {
        return station;
    }

    public void add(TransitImmediateEdge edge) {
        startEdges.add(edge);
    }

    @Override
    public void forEachEdgeAfter(LocalDateTime time, Consumer<TransitEdge> edgeConsumer) {
        for (TransitImmediateEdge edge : startEdges) {
            edgeConsumer.accept(edge);
        }
    }

    @Override
    public String toString() {
        return station.getName() + " [START]";
    }
}
