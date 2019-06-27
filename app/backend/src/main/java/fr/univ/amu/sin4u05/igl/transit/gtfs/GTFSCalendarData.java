package fr.univ.amu.sin4u05.igl.transit.gtfs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.EnumMap;

class GTFSCalendarData {

    private final static byte MONDAY = 0b00000001;
    private final static byte TUESDAY = 0b00000010;
    private final static byte WEDNESDAY = 0b00000100;
    private final static byte THURSDAY = 0b00001000;
    private final static byte FRIDAY = 0b00010000;
    private final static byte SATURDAY = 0b00100000;
    private final static byte SUNDAY = 0b01000000;

    private static EnumMap<DayOfWeek, Byte> DAY_OF_WEEK_TO_MASK = new EnumMap<>(DayOfWeek.class);

    static {
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.MONDAY, MONDAY);
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.TUESDAY, TUESDAY);
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.WEDNESDAY, WEDNESDAY);
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.THURSDAY, THURSDAY);
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.FRIDAY, FRIDAY);
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.SATURDAY, SATURDAY);
        DAY_OF_WEEK_TO_MASK.put(DayOfWeek.SUNDAY, SUNDAY);
    }

    private final byte weekService;
    private final LocalDate startDate;
    private final LocalDate endDate;

    GTFSCalendarData(byte weekService, LocalDate startDate, LocalDate endDate) {
        this.weekService = weekService;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    boolean isServiceProvided(LocalDate date) {
        byte mask = DAY_OF_WEEK_TO_MASK.get(date.getDayOfWeek());
        return inRange(date) && (weekService & mask) != 0;
    }

    private boolean inRange(LocalDate date) {
        return (startDate.isBefore(date) || startDate.isEqual(date))
                && (endDate.isAfter(date) || endDate.isEqual(date));
    }
}
