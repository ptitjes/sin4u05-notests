package fr.univ.amu.sin4u05.igl.search;

/**
 * A search driver for the A* algorithm.
 *
 * @param <N> the type of the nodes of the graph.
 * @param <E> the type of the edges of the graph.
 * @param <S> the type of the companion states.
 * @see Search
 */
public interface SearchDriver<N, E, S> {

    /**
     * Computes the edges that can be traversed from the node {@code sourceNode} (with companion state
     * {@code sourceState}). For each of these edges it calls the specified {@code consumer}'s
     * {@link EdgeConsumer#accept(Object, Object, Object)} method.
     *
     * @param sourceNode  the source node of the edges.
     * @param sourceState the companion state of {@code sourceNode}.
     * @param consumer    the consumer for the edges traversable from {@code sourceNode}.
     */
    void forEachEdgeFrom(N sourceNode, S sourceState, EdgeConsumer<N, E, S> consumer);

    /**
     * Computes the cost from the start node to the specified node {@code node} (with companion state {@code state}).
     *
     * @param node  the node to which the travel cost from the start node must be computed.
     * @param state the companion state of {@code node}.
     * @return the computed cost of the travel from the start node to the specified node {@code node}.
     */
    double costFromStart(N node, S state);

    /**
     * Estimates the cost to travel from the specified node {@code node} (with companion state {@code state}) to the
     * goal node.
     *
     * @param node  the node from which the travel cost to the goal node must be estimated.
     * @param state the companion state of {@code node}.
     * @return the estimated cost of the travel from the specified node {@code node} to the goal node.
     */
    double estimateCostToGoal(N node, S state);
}
