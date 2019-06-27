package fr.univ.amu.sin4u05.igl.transit.gtfs;

import fr.univ.amu.sin4u05.igl.routes.StationStop;

import java.util.Objects;

public class GTFSTransfer {

    private final StationStop from;
    private final StationStop to;

    GTFSTransfer(StationStop from, StationStop to) {
        this.from = from;
        this.to = to;
    }

    public StationStop getFrom() {
        return from;
    }

    public StationStop getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GTFSTransfer that = (GTFSTransfer) o;
        return from.equals(that.from) &&
                to.equals(that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
