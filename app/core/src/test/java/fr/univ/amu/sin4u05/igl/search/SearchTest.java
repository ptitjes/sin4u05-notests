package fr.univ.amu.sin4u05.igl.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Some tests for the {@link Search} class.
 *
 * For the sake of testing, we are here using a terrain that is a 2-dimensional grid where we are trying to make a
 * robot travel from a point A to a point B. The robot can only move vertically and horizontally. The terrain have
 * elevations that cost the robot more energy to travel.
 *
 * The cost to move one cell to the left, right, top or bottom cost 1 unit of energy to the robot. If there is an
 * ascending or descending elevation, then the cost of the move is augmented by 2 * the elevation difference.
 * See the implementation in {@link TerrainSearchDriver#costFromStart(Location, Integer)}.
 *
 * The heuristic used to estimate the energy cost yet to pay to reach the goal is also estimated using the Mannhatan
 * distance, accounting for the elevation difference.
 * See the implementation in {@link SearchDriver#estimateCostToGoal(Object, Object)}.
 *
 */
class SearchTest {

    @Test
    void searchStraighPath() {
        Terrain terrain = new Terrain(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        });

        Assertions.assertEquals(
                p(
                        e(l(0, 2), 1.0, l(1, 2)),
                        e(l(1, 2), 1.0, l(2, 2)),
                        e(l(2, 2), 1.0, l(3, 2)),
                        e(l(3, 2), 1.0, l(4, 2)),
                        e(l(4, 2), 1.0, l(5, 2)),
                        e(l(5, 2), 1.0, l(6, 2)),
                        e(l(6, 2), 1.0, l(7, 2)),
                        e(l(7, 2), 1.0, l(8, 2)),
                        e(l(8, 2), 1.0, l(9, 2))
                ),
                doSearch(terrain, l(0, 2), l(9, 2))
        );
    }

    @Test
    void searchCornerPath() {
        Terrain terrain = new Terrain(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        });

        Assertions.assertEquals(
                p(
                        e(l(0, 0), 1.0, l(1, 0)),
                        e(l(1, 0), 1.0, l(2, 0)),
                        e(l(2, 0), 1.0, l(3, 0)),
                        e(l(3, 0), 1.0, l(4, 0)),
                        e(l(4, 0), 1.0, l(5, 0)),
                        e(l(5, 0), 1.0, l(6, 0)),
                        e(l(6, 0), 1.0, l(7, 0)),
                        e(l(7, 0), 1.0, l(8, 0)),
                        e(l(8, 0), 1.0, l(9, 0)),
                        e(l(9, 0), 1.0, l(9, 1)),
                        e(l(9, 1), 1.0, l(9, 2)),
                        e(l(9, 2), 1.0, l(9, 3)),
                        e(l(9, 3), 1.0, l(9, 4))
                ),
                doSearch(terrain, l(0, 0), l(9, 4))
        );
    }

    @Test
    void searchOneRoundindPath() {
        Terrain terrain = new Terrain(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 1},
                {0, 0, 1, 2, 2, 2, 2, 1, 0, 0},
                {0, 0, 1, 2, 3, 3, 2, 2, 1, 0},
                {0, 0, 1, 2, 2, 2, 2, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1}
        });

        Assertions.assertEquals(
                p(
                        e(l(0, 3), 1.0, l(1, 3)),
                        e(l(1, 3), 1.0, l(1, 2)),
                        e(l(1, 2), 1.0, l(1, 1)),
                        e(l(1, 1), 1.0, l(2, 1)),
                        e(l(2, 1), 1.0, l(2, 0)),
                        e(l(2, 0), 1.0, l(3, 0)),
                        e(l(3, 0), 1.0, l(4, 0)),
                        e(l(4, 0), 1.0, l(5, 0)),
                        e(l(5, 0), 1.0, l(6, 0)),
                        e(l(6, 0), 1.0, l(7, 0)),
                        e(l(7, 0), 1.0, l(7, 1)),
                        e(l(7, 1), 1.0, l(8, 1)),
                        e(l(8, 1), 1.0, l(8, 2)),
                        e(l(8, 2), 1.0, l(9, 2)),
                        e(l(9, 2), 1.0, l(9, 3))
                ),
                doSearch(terrain, l(0, 3), l(9, 3))
        );
    }

    @Test
    void searchMazePath() {
        Terrain terrain = new Terrain(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 1, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
        });

        Assertions.assertEquals(
                p(
                        e(l(0, 0), 1.0, l(0, 1)),
                        e(l(0, 1), 1.0, l(0, 2)),
                        e(l(0, 2), 1.0, l(0, 3)),
                        e(l(0, 3), 1.0, l(0, 4)),
                        e(l(0, 4), 1.0, l(1, 4)),
                        e(l(1, 4), 1.0, l(2, 4)),
                        e(l(2, 4), 1.0, l(3, 4)),
                        e(l(3, 4), 1.0, l(4, 4)),
                        e(l(4, 4), 1.0, l(4, 3)),
                        e(l(4, 3), 1.0, l(4, 2)),
                        e(l(4, 2), 1.0, l(3, 2)),
                        e(l(3, 2), 1.0, l(2, 2)),
                        e(l(2, 2), 1.0, l(2, 1)),
                        e(l(2, 1), 1.0, l(2, 0)),
                        e(l(2, 0), 1.0, l(3, 0)),
                        e(l(3, 0), 1.0, l(4, 0)),
                        e(l(4, 0), 1.0, l(5, 0)),
                        e(l(5, 0), 1.0, l(6, 0)),
                        e(l(6, 0), 1.0, l(6, 1)),
                        e(l(6, 1), 1.0, l(6, 2)),
                        e(l(6, 2), 1.0, l(7, 2)),
                        e(l(7, 2), 1.0, l(7, 3)),
                        e(l(7, 3), 1.0, l(7, 4)),
                        e(l(7, 4), 1.0, l(8, 4)),
                        e(l(8, 4), 1.0, l(9, 4))
                ),
                doSearch(terrain, l(0, 0), l(9, 4))
        );
    }

    @Test
    void searchNoPath() {
        Terrain terrain = new Terrain(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, new int[][]{
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
        });

        Assertions.assertNull(doSearch(terrain, l(0, 2), l(9, 2)));
    }

    static Path<TerrainEdge> doSearch(Terrain terrain, Location start, Location goal) {
        if (DEBUG) clearDebug();
        return Search.search(start, 0, goal, new TerrainSearchDriver(terrain, goal));
    }

    /**
     * The state of a node is simply its getDistance travelled from the start node. We encode it as an integer.
     */
    static class TerrainSearchDriver implements SearchDriver<Location, TerrainEdge, Integer> {
        private final Terrain terrain;
        private final Location goal;

        TerrainSearchDriver(Terrain terrain, Location goal) {
            this.terrain = terrain;
            this.goal = goal;
        }

        @Override
        public void forEachEdgeFrom(Location sourceNode, Integer sourceState,
                                    EdgeConsumer<Location, TerrainEdge, Integer> consumer) {
            terrain.edgesFrom(sourceNode).forEach(edge -> {
                Location targetNode = edge.target;
                Integer targetState = sourceState + terrain.distanceWithElevationAccount(sourceNode, targetNode);
                consumer.accept(edge, targetNode, targetState);
            });

            debug[sourceNode.y][sourceNode.x]++;
            if (DEBUG) debug();
        }

        @Override
        public double costFromStart(Location node, Integer state) {
            return state;
        }

        @Override
        public double estimateCostToGoal(Location node, Integer state) {
            return terrain.distanceWithElevationAccount(node, goal);
        }
    }

    static final boolean DEBUG = false;

    static final int[][] debug = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    static void clearDebug() {
        for (int i = 0; i < debug.length; i++) {
            for (int j = 0; j < debug[i].length; j++) {
                System.out.print(debug[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void debug() {
        for (int i = 0; i < debug.length; i++) {
            for (int j = 0; j < debug[i].length; j++) {
                System.out.print(debug[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static class Terrain {

        private final int[][] elevation;
        private final int[][] obstacle;
        private final int width, height;

        Terrain(int[][] elevation) {
            this(elevation, null);
        }

        Terrain(int[][] elevation, int[][] obstacle) {
            this.elevation = elevation;

            this.height = this.elevation.length;
            assert this.height > 0;

            this.width = elevation[0].length;
            for (int i = 0; i < this.height; i++) {
                assert this.elevation[i].length == this.width;
            }

            this.obstacle = obstacle;
            if (this.obstacle != null) {
                assert this.obstacle.length == this.height;
                for (int i = 0; i < this.height; i++) {
                    assert this.obstacle[i].length == this.width;
                }
            }
        }

        List<TerrainEdge> edgesFrom(Location node) {
            List<TerrainEdge> edges = new ArrayList<>(4);

            if (node.x > 0) makeEdge(edges, node, new Location(node.x - 1, node.y));
            if (node.x < this.width - 1) makeEdge(edges, node, new Location(node.x + 1, node.y));
            if (node.y > 0) makeEdge(edges, node, new Location(node.x, node.y - 1));
            if (node.y < this.height - 1) makeEdge(edges, node, new Location(node.x, node.y + 1));

            return edges;
        }

        private void makeEdge(List<TerrainEdge> edges, Location c1, Location c2) {
            if (this.obstacle == null || this.obstacle[c2.y][c2.x] == 0) {
                edges.add(new TerrainEdge(c1, distanceWithElevationAccount(c1, c2), c2));
            }
        }

        int distanceWithElevationAccount(Location c1, Location c2) {
            // Manhattan getDistance + account for elevation
            return Math.abs(c1.x - c2.x) + Math.abs(c1.y - c2.y) +
                    2 * Math.abs(elevation[c1.y][c1.x] - elevation[c2.y][c2.x]);
        }
    }

    static class TerrainEdge {

        final Location source;
        final Location target;
        final double cost;

        TerrainEdge(Location source, double cost, Location target) {
            this.source = source;
            this.target = target;
            this.cost = cost;
        }

        public Location source() {
            return source;
        }

        public Location target() {
            return target;
        }

        @Override
        public String toString() {
            return "e(" + source + ", " + cost + ", " + target + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TerrainEdge that = (TerrainEdge) o;
            return Double.compare(that.cost, cost) == 0 &&
                    Objects.equals(source, that.source) &&
                    Objects.equals(target, that.target);
        }

        @Override
        public int hashCode() {
            return Objects.hash(source, target, cost);
        }
    }

    static class Location {

        final int x;
        final int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location that = (Location) o;
            return x == that.x &&
                    y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "l(" + x + ", " + y + ")";
        }
    }

    static Path<TerrainEdge> p(TerrainEdge... edges) {
        return new Path<>(Arrays.asList(edges));
    }

    static TerrainEdge e(Location source, double cost, Location target) {
        return new TerrainEdge(source, (float) cost, target);
    }

    static Location l(int x, int y) {
        return new Location(x, y);
    }
}
