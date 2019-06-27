package fr.univ.amu.sin4u05.igl.search;

import com.github.penemue.keap.PriorityQueue;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Consumer;

class SearchEngine<N, E, S> {

    private static final int DEBUG = 0;
    private static final int STATISTICS = 0;

    private final N startNode;
    private final S startState;
    private final N goalNode;
    private final SearchDriver<N, E, S> driver;
    private final Consumer<N> progressMonitor;

    private Statistics statistics;


    SearchEngine(N startNode, S startState, N goalNode,
                 SearchDriver<N, E, S> driver,
                 Consumer<N> progressMonitor) {

        this.startNode = startNode;
        this.startState = startState;
        this.goalNode = goalNode;
        this.driver = driver;
        this.progressMonitor = progressMonitor;
    }

    Path<E> doSearch() {

        if (DEBUG > 0) System.out.println("\n\n--- START SEARCH ---\n\n");

        if (STATISTICS > 0) statistics = new Statistics();

        Set<N> visitedNodes = new HashSet<>();
        PriorityQueue<SearchNode> queue = new PriorityQueue<>();

        SearchNode start = new SearchNode(startNode, driver.estimateCostToGoal(startNode, startState));
        visitedNodes.add(startNode);
        queue.offer(start);

        while (queue.size() > 0) {
            final SearchNode current = queue.remove();

            if (progressMonitor != null) progressMonitor.accept(current.node);

            if (DEBUG > 1) {
                System.out.println(current.getNode() +
                        " (" + current.getState() +
                        ", totalCost=" + roundedCost(current.getTotalCost()) +
                        ", costFromStart=" + roundedCost(current.getCostFromStart()) +
                        ", coastToGoal=" + roundedCost(current.getCoastToGoal()) +
                        ")");
            }

            if (current.node.equals(goalNode)) {
                if (STATISTICS > 0) {
                    System.out.println(statistics.toString());
                    System.out.println();
                }

                return current.pathFromRoot();
            } else {

                driver.forEachEdgeFrom(current.getNode(), current.getState(), (edge, targetNode, targetState) -> {

                    if (STATISTICS > 0) statistics.edgeCount++;

                    boolean visited = visitedNodes.contains(targetNode);

                    SearchNode target = new SearchNode(targetNode, driver.estimateCostToGoal(targetNode, targetState));

                    if (STATISTICS > 0) statistics.nodeCount++;

                    target.setBackPointer(new BackPointer(current, edge, targetState, target));

                    if (DEBUG > 1) {
                        System.out.println("  >> " + edge +
                                " (targetState=" + targetState +
                                ", targetCost=" + roundedCost(target.getTotalCost()) +
                                ", visited=" + visited +
                                ")");
                    }

                    if (visited) return;
                    visitedNodes.add(targetNode);

                    queue.add(target);
                });
            }

            if (DEBUG > 2) {
                System.out.println();
            }

            if (STATISTICS > 1) {
                System.out.println(statistics.toString());
                System.out.println();
            }
        }

        if (STATISTICS > 0) {
            System.out.println(statistics.toString());
            System.out.println();
        }

        return null;
    }

    private class SearchNode implements Comparable<SearchNode> {

        private final N node;
        private final double coastToGoal;

        private BackPointer backPointer;

        SearchNode(N node, double coastToGoal) {
            this.node = node;
            this.coastToGoal = coastToGoal;
        }

        N getNode() {
            return node;
        }

        double getCoastToGoal() {
            return coastToGoal;
        }

        double getCostFromStart() {
            return backPointer == null ? 0 : backPointer.getCostFromStart();
        }

        S getState() {
            return backPointer == null ? startState : backPointer.targetState;
        }

        double getTotalCost() {
            return getCostFromStart() + coastToGoal;
        }

        void setBackPointer(BackPointer backPointer) {
            this.backPointer = backPointer;
        }

        @Override
        public int compareTo(@NotNull SearchNode other) {
            return Double.compare(this.getTotalCost(), other.getTotalCost());
        }

        Path<E> pathFromRoot() {
            LinkedList<E> path = new LinkedList<>();

            SearchNode searchNode = this;
            while (searchNode.backPointer != null) {
                BackPointer backPointer = searchNode.backPointer;
                path.addFirst(backPointer.edge);

                searchNode = backPointer.parent;
            }

            return new Path<>(path);
        }
    }

    private class BackPointer implements Comparable<BackPointer> {
        final SearchNode parent;
        final E edge;
        final S targetState;
        final SearchNode child;

        BackPointer(SearchNode parent, E edge, S targetState, SearchNode child) {
            this.parent = parent;
            this.edge = edge;
            this.targetState = targetState;
            this.child = child;
        }

        double getCostFromStart() {
            return driver.costFromStart(child.node, targetState);
        }

        @Override
        public int compareTo(@NotNull BackPointer other) {
            return Double.compare(getCostFromStart(), other.getCostFromStart());
        }
    }

    private double roundedCost(double cost) {
        return (double) Math.round(cost * 100) / 100;
    }

    private class Statistics {
        long nodeCount = 0;
        long edgeCount = 0;

        @Override
        public String toString() {
            return "nodeCount=" + nodeCount + ", edgeCount=" + edgeCount;
        }
    }
}
