package fr.univ.amu.sin4u05.igl.transit.ui;

import fr.univ.amu.sin4u05.igl.routes.Station;
import javafx.event.Event;
import javafx.event.EventType;

import java.time.LocalDateTime;

public class SearchEvent extends Event {

    public static EventType<SearchEvent> SEARCH = new EventType<>("SEARCH");

    public final Station from;
    public final Station to;
    public final LocalDateTime startTime;

    public SearchEvent(Station from, Station to, LocalDateTime startTime) {
        super(SEARCH);
        this.from = from;
        this.to = to;
        this.startTime = startTime;
    }
}
