package fr.univ.amu.sin4u05.igl.search;

import java.util.function.Consumer;

/**
 * An implementation of the A* algorithm to find the shortest path from a start node to a goal node.
 * The A* algorithm search for the shortest path by exploring the graph while trying, for each node <code>n</code>
 * traveled through, to minimize the sum of
 * <ul>
 * <li>the cost of the travel already done to reach the current node, often denoted by <code>g(n)</code>,</li>
 * <li>and the estimated cost to reach the goal node from the current node, often denoted by <code>h(n)</code> and
 * called the heuristic part).</li>
 * </ul>
 * <p>
 * The search can be executed by the static {@link #search(Object, Object, Object, SearchDriver)} or
 * {@link #search(Object, Object, Object, SearchDriver, Consumer)} method.
 * <p>
 * The driver provided to each of these two methods is responsible for
 * <ul>
 * <li>unveiling the neighbor nodes accessible from one node,</li>
 * <li>computing the cost that the travel from the start node to the current node already caused
 * (i.e. <code>g(n)</code>),</li>
 * <li>and estimating the cost of the travel from the current node to the goal node yet to occur
 * (i.e. <code>h(n)</code>).</li>
 * </ul>
 * <p>
 * During the traversal, this implementation maintains a companion state of type {@code S} to the current node.
 * This gives the user the ability to keep some history of the traversal already done in order to compute the costs.
 * <p>
 * See <a href="https://en.wikipedia.org/wiki/A%2A_search_algorithm">Best-first Search</a>,
 * for an in-depth description of the A* algorithm.
 *
 * @see SearchDriver
 * @see Path
 */
@SuppressWarnings("WeakerAccess")
public class Search {

    /**
     * Runs a search from a node {@code startNode} (with specified state {@code startState}) to a node
     * {@code goalNode} using the specified search driver {@code driver}.
     *
     * @param startNode  the start node.
     * @param startState the companion start state to the start node.
     * @param goalNode   the goal node to reach.
     * @param driver     the driver for the search.
     * @param <N>        the type of the nodes of the graph.
     * @param <E>        the type of the edges of the graph.
     * @param <S>        the type of the companion states.
     * @return the found shortest path between {@code startNode} and {@code goalNode}.
     */
    public static <N, E, S> Path<E> search(N startNode, S startState, N goalNode, SearchDriver<N, E, S> driver) {

        return search(startNode, startState, goalNode, driver, null);
    }

    /**
     * Runs a search from a node {@code startNode} (with specified state {@code startState}) to a node
     * {@code goalNode} using the specified search driver {@code driver}.
     *
     * @param startNode       the start node.
     * @param startState      the companion start state to the start node.
     * @param goalNode        the goal node to reach.
     * @param driver          the driver for the search.
     * @param progressMonitor the progress monitor for the traversal.
     * @param <N>             the type of the nodes of the graph.
     * @param <E>             the type of the edges of the graph.
     * @param <S>             the type of the companion states.
     * @return the found shortest path between {@code startNode} and {@code goalNode}.
     */
    public static <N, E, S> Path<E> search(N startNode, S startState, N goalNode,
                                           SearchDriver<N, E, S> driver,
                                           Consumer<N> progressMonitor) {

        return new SearchEngine<>(startNode, startState, goalNode, driver, progressMonitor).doSearch();
    }

    private Search() {
    }
}
