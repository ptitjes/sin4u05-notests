package fr.univ.amu.sin4u05.igl.transit.gtfs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class GTFSCalendarDatesData {

    private final Map<LocalDate, GTFSCalendarDatesExceptionType> dates = new HashMap<>();

    GTFSCalendarDatesData() {
    }

    void addDate(LocalDate date, GTFSCalendarDatesExceptionType exceptionType) {
        dates.put(date, exceptionType);
    }

    boolean isServiceProvided(LocalDate date) {
        GTFSCalendarDatesExceptionType exceptionType = dates.get(date);
        return exceptionType == null || exceptionType == GTFSCalendarDatesExceptionType.ADDED_SERVICE;
    }
}
