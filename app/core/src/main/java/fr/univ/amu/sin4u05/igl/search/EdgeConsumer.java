package fr.univ.amu.sin4u05.igl.search;

/**
 * A consumer for graph edges.
 *
 * @param <N> the type of the nodes of the graph.
 * @param <E> the type of the edges of the graph.
 * @param <S> the type of the companion states.
 */
@FunctionalInterface
public interface EdgeConsumer<N, E, S> {

    /**
     * This method must be called to notify the consumer of each of the edges that can be traversed.
     *
     * @param edge        the edge object that is traversed.
     * @param targetNode  the target node that is reached after traversing the edge {@code edge}.
     * @param targetState the companion state of {@code targetNode} obtained after traversing the edge {@code edge}.
     */
    void accept(E edge, N targetNode, S targetState);
}
