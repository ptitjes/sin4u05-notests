package fr.univ.amu.sin4u05.igl.routes;

import fr.univ.amu.sin4u05.igl.util.Coordinates;

import java.util.Objects;

/**
 * A stop of the transport network.
 */
public class StationStop {

    private final int id;
    private final Station station;
    private final Coordinates coordinates;

    /**
     * Constructs a new {@code StationStop} with the specified {@code id}, {@code station} to which it belongs, and
     * {@code coordinates} at which it is located.
     *
     * @param id          the unique id of the stop.
     * @param station     the station which this stops belongs to.
     * @param coordinates the geographical coordinates which the stop is located at.
     */
    public StationStop(int id, Station station, Coordinates coordinates) {
        this.id = id;
        this.station = station;
        this.coordinates = coordinates;

        station.addStop(this);
    }

    /**
     * Returns the unique id of the stop.
     *
     * @return the unique id of the stop.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the station which this stops belongs to.
     *
     * @return the station which this stops belongs to.
     */
    public Station getStation() {
        return station;
    }

    /**
     * Returns the name of the station which this stops belongs to.
     *
     * @return the name of the station which this stops belongs to.
     */
    public String getName() {
        return station.getName();
    }

    /**
     * Returns the geographical coordinates which the stop is located at.
     *
     * @return the geographical coordinates which the stop is located at.
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Compares this stop to the specified object. The result is {@code true} if and only if the argument is not
     * {@code null} and is a {@code StationStop} object with the same id.
     *
     * @param o the object to compare this {@code Station} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationStop stationStop = (StationStop) o;
        return id == stationStop.id;
    }

    /**
     * Returns a hash code for this stop. The hash code of a stop is the hash code of its id.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Returns a string representation of this {@code StationStop} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return getName() + " [" + id + "]";
    }
}
