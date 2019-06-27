package fr.univ.amu.sin4u05.igl.routes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A station of the transport network.
 */
public class Station {

    private final String name;
    private final Set<StationStop> stops = new LinkedHashSet<>();

    /**
     * Constructs a new {@code Station} with the specified {@code name}.
     *
     * @param name the name of station.
     */
    public Station(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the station.
     *
     * @return the name of the station.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the stops of the station.
     *
     * @return the stops of the station.
     */
    public Set<StationStop> getStops() {
        return stops;
    }

    void addStop(StationStop stop) {
        stops.add(stop);
    }

    /**
     * Compares this station to the specified object. The result is {@code true} if and only if the argument is not
     * {@code null} and is a {@code Station} object with the same name.
     *
     * @param o the object to compare this {@code Station} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station that = (Station) o;
        return name.equals(that.name);
    }

    /**
     * Returns a hash code for this station. The hash code of a station is the hash code of its name.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * Returns a string representation of this {@code Station} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return name;
    }
}
