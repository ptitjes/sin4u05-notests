package fr.univ.amu.sin4u05.igl.util;

import java.text.NumberFormat;
import java.util.Objects;

/**
 * The {@code Coordinates} class stores some geographical coordinates. It consists of a latitude, a longitude and an
 * elevation.
 */
@SuppressWarnings("WeakerAccess")
public class Coordinates {

    private static final double EARTH_RADIUS = 6371;

    /**
     * The latitude.
     */
    public final double latitude;

    /**
     * The longitude.
     */
    public final double longitude;

    /**
     * The elevation.
     */
    public final double elevation;


    public Coordinates(double latitude, double longitude) {
        this(latitude, longitude, 0);
    }

    /**
     * Constructs a new {@code Coordinates} for the specified {@code latitude}, {@code longitude}, and
     * {@code elevation}.
     *
     * @param latitude  the latitude.
     * @param longitude the longitude.
     * @param elevation the elevation.
     */
    public Coordinates(double latitude, double longitude, double elevation) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
    }

    /**
     * Computes the distance between this coordinates and the specified coordinates.
     *
     * @param other the other coordinates to compute the distance to.
     * @return the distance to the other coordinates.
     */
    public double distanceTo(Coordinates other) {
        return distance(this, other);
    }

    /**
     * Compares these coordinates to the specified object. The result is {@code true} if and only if the argument is
     * not {@code null} and is a {@code Coordinates} object with the same latitude, longitude and elevation.
     *
     * @param o the object to compare this {@code Coordinates} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.elevation, elevation) == 0;
    }

    /**
     * Returns a hash code for these coordinates. The hash code of some coordinates is the hash code of its latitude,
     * longitude and elevation.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, elevation);
    }

    private final static NumberFormat DISPLAY_FORMAT;

    static {
        DISPLAY_FORMAT = NumberFormat.getNumberInstance();
        DISPLAY_FORMAT.setMinimumFractionDigits(2);
        DISPLAY_FORMAT.setMaximumFractionDigits(2);
    }

    /**
     * Returns a string representation of this {@code Coordinates} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return "(" + DISPLAY_FORMAT.format(latitude) +
                ", " + DISPLAY_FORMAT.format(longitude) +
                (elevation == 0 ? "" : ", " + DISPLAY_FORMAT.format(elevation)) +
                ")";
    }

    /**
     * Computes the distance between a pair of coordinates.
     *
     * @param c1 the first coordinates.
     * @param c2 the second coordinates.
     * @return the distance to the two coordinates.
     */
    public static double distance(Coordinates c1, Coordinates c2) {

        double latDistance = Math.toRadians(c2.latitude - c1.latitude);
        double lonDistance = Math.toRadians(c2.longitude - c1.longitude);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(c1.latitude)) * Math.cos(Math.toRadians(c2.latitude))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = EARTH_RADIUS * c * 1000; // convert to meters

        double height = c1.elevation - c2.elevation;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
