package fr.univ.amu.sin4u05.igl.search;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A path from one node to another node in the search graph. It consists only of the traversed edges of the graph.
 *
 * @param <E> the type of the edges of the graph.
 */
public class Path<E> {

    private final List<E> edges;

    Path(List<E> edges) {
        this.edges = Collections.unmodifiableList(edges);
    }

    /**
     * Returns the ordered list of edges of this path through the search graph.
     *
     * @return the ordered list of edges.
     */
    public List<E> getEdges() {
        return edges;
    }

    /**
     * Compares this path to the specified object. The result is {@code true} if and only if the argument is not
     * {@code null} and is a {@code Path} object that represents the same sequence of edges as this object.
     *
     * @param o the object to compare this {@code Path} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path<?> path = (Path<?>) o;
        return Objects.equals(edges, path.edges);
    }

    /**
     * Returns a hash code for this path. The hash code of a path is the hash code of its list of edges.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(edges);
    }

    /**
     * Returns a string representation of this {@code Path} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return edges.stream().reduce("", (acc, e) -> acc + e.toString() + "\n", (s1, s2) -> s1 + s2);
    }
}
