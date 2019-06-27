package fr.univ.amu.sin4u05.igl.routes;

import java.util.Objects;

/**
 * A line of the transport network.
 */
public class TransportLine {

    private final String shortName;
    private final String name;
    private final TransportLineType type;

    /**
     * Constructs a new {@code TransportLine} with the specified {@code shortName}, {@code name}, and {@code type}.
     *
     * @param shortName the short name of the transport line.
     * @param name      the proper name of the transport line.
     * @param type      the type of transport line.
     */
    public TransportLine(String shortName, String name, TransportLineType type) {
        this.shortName = shortName;
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the short name of the line.
     *
     * @return the short name of the line.
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Returns the proper name of the line.
     *
     * @return the proper name of the line.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the type of the line.
     *
     * @return the type of the line.
     */
    public TransportLineType getType() {
        return type;
    }

    /**
     * Compares this line to the specified object. The result is {@code true} if and only if the argument is not
     * {@code null} and is a {@code TransportLine} object with the same short name.
     *
     * @param o the object to compare this {@code TransportLine} against.
     * @return {@code true} if the objects are the same; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportLine that = (TransportLine) o;
        return shortName.equals(that.shortName);
    }

    /**
     * Returns a hash code for this line. The hash code of a line is the hash code of its short name.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(shortName);
    }

    /**
     * Returns a string representation of this {@code TransportLine} object.
     *
     * @return a {@code String} representation of this object.
     */
    @Override
    public String toString() {
        return shortName;
    }
}
