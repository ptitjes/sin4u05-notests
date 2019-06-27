package fr.univ.amu.sin4u05.igl.transit.graph;

import fr.univ.amu.sin4u05.igl.routes.StationStop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TransitWaitNode extends TransitNode {

    private TransitImmediateEdge waitEndEdge;
    private List<TransitTransferEdge> transferEdges = new ArrayList<>();
    private List<TransitImmediateEdge> tripStartEdges = new ArrayList<>();

    TransitWaitNode(StationStop stop) {
        super(TransitNodeType.Wait, stop);
    }

    void setWaitEndEdge(TransitImmediateEdge edge) {
        assert waitEndEdge == null;
        waitEndEdge = edge;
    }

    void addTransferEdge(TransitTransferEdge edge) {
        transferEdges.add(edge);
    }

    void addTripStartEdge(TransitImmediateEdge edge) {
        tripStartEdges.add(edge);
    }

    @Override
    public void forEachEdgeAfter(LocalDateTime time, Consumer<TransitEdge> edgeConsumer) {
        edgeConsumer.accept(waitEndEdge);

        for (TransitTransferEdge edge : transferEdges) {
            edgeConsumer.accept(edge);
        }

        for (TransitImmediateEdge edge : tripStartEdges) {
            edgeConsumer.accept(edge);
        }
    }
}
