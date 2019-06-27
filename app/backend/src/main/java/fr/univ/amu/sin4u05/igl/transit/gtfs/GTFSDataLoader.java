package fr.univ.amu.sin4u05.igl.transit.gtfs;

import fr.univ.amu.sin4u05.igl.routes.Station;
import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.TransportLineType;
import fr.univ.amu.sin4u05.igl.util.Coordinates;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class GTFSDataLoader {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static GTFSDataSet load(File file) throws IOException {

        Map<String, Station> stationsByName = new HashMap<>();

        Map<String, GTFSRoute> routesById = new HashMap<>();
        Map<Integer, GTFSTrip> tripsById = new HashMap<>();
        Map<Integer, StationStop> stopsById = new HashMap<>();
        List<GTFSTransfer> transfers = new ArrayList<>();

        Map<String, GTFSCalendarData> calendarDataByServiceId = new HashMap<>();
        Map<String, GTFSCalendarDatesData> calendarDatesDataByServiceId = new HashMap<>();

        ZipFile zipFile = new ZipFile(file);

        CSVParser.parse(zipFile.getInputStream(zipFile.getEntry("calendar.txt")),
                new String[]{"service_id",
                        "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday",
                        "start_date", "end_date"},
                (data) -> {
                    String serviceId = data[0];
                    byte weekService = 0;
                    for (int i = 0; i < 7; i++) {
                        weekService |= Byte.parseByte(data[i + 1]) << i;
                    }
                    LocalDate startDate = LocalDate.parse(data[8], DATE_TIME_FORMATTER);
                    LocalDate endDate = LocalDate.parse(data[9], DATE_TIME_FORMATTER);

                    calendarDataByServiceId.put(serviceId, new GTFSCalendarData(
                            weekService, startDate, endDate
                    ));
                }
        );

        CSVParser.parse(zipFile.getInputStream(zipFile.getEntry("calendar_dates.txt")),
                new String[]{"\uFEFFservice_id", "date", "exception_type"},
                (data) -> {
                    String serviceId = data[0];
                    LocalDate date = LocalDate.parse(data[1], DATE_TIME_FORMATTER);

                    int expectionTypeInt = Integer.parseInt(data[2]);
                    GTFSCalendarDatesExceptionType exceptionType =
                            expectionTypeInt == 1 ? GTFSCalendarDatesExceptionType.ADDED_SERVICE :
                                    expectionTypeInt == 2 ? GTFSCalendarDatesExceptionType.REMOVED_SERVICE :
                                            null;

                    GTFSCalendarDatesData datesData =
                            calendarDatesDataByServiceId.computeIfAbsent(serviceId, t -> new GTFSCalendarDatesData());
                    datesData.addDate(date, exceptionType);
                }
        );

        CSVParser.parse(zipFile.getInputStream(zipFile.getEntry("routes.txt")),
                new String[]{"\uFEFFroute_id", "route_short_name", "route_long_name", "route_type"},
                (data) -> {
                    String routeId = data[0];
                    String routeShortName = data[2];

                    routesById.put(routeId,
                            new GTFSRoute(data[1], routeShortName, TransportLineType.byCode(Integer.parseInt(data[3])))
                    );
                }
        );

        CSVParser.parse(zipFile.getInputStream(zipFile.getEntry("stops.txt")),
                new String[]{"\uFEFFstop_id", "stop_name", "stop_lat", "stop_lon", "stop_code"},
                (data) -> {
                    int stopId = Integer.parseInt(data[0]);
                    String stopName = data[1];

                    int stopCode = Integer.parseInt(data[4]);
                    if (stopId != stopCode) {
                        stopId = stopCode;
                    }

                    Station station = stationsByName.computeIfAbsent(stopName, Station::new);

                    StationStop stop = new StationStop(
                            stopId, station,
                            new Coordinates(Double.parseDouble(data[2]), Double.parseDouble(data[3]))
                    );
                    stopsById.put(stopId, stop);
                }
        );

        CSVParser.parse(zipFile.getInputStream(zipFile.getEntry("trips.txt")),
                new String[]{"\uFEFFroute_id", "service_id", "trip_id", "trip_headsign", "direction_id"},
                (data) -> {
                    String routeId = data[0];
                    String serviceId = data[1];
                    int tripId = Integer.parseInt(data[2]);
                    String headSign = data[3];

                    GTFSRoute route = routesById.get(routeId);
                    tripsById.computeIfAbsent(tripId, (id) -> {
                        GTFSTrip trip = new GTFSTrip(serviceId, route, id, headSign);
                        route.addTrip(trip);
                        return trip;
                    });
                }
        );

        CSVParser.parse(zipFile.getInputStream(zipFile.getEntry("stop_times.txt")),
                new String[]{"\uFEFFtrip_id", "arrival_time", "departure_time", "stop_id", "stop_sequence"},
                (data) -> {
                    int tripId = Integer.parseInt(data[0]);
                    int arrivalTime = parseTime(data[1]);
                    int departureTime = parseTime(data[2]);
                    int stopId = Integer.parseInt(data[3]);

                    GTFSTrip trip = tripsById.get(tripId);
                    trip.addStop(stopsById.get(stopId), arrivalTime, departureTime);
                }
        );

        ZipEntry transfersEntry = zipFile.getEntry("transfers.txt");
        if (transfersEntry != null) {
            CSVParser.parse(zipFile.getInputStream(transfersEntry),
                    new String[]{"\uFEFFfrom_stop_id", "to_stop_id", "transfer_type"},
                    (data) -> {
                        if (!data[2].equals("") && !data[2].equals("0")) return;

                        int fromStopId = Integer.parseInt(data[0]);
                        int toStopId = Integer.parseInt(data[1]);

                        transfers.add(new GTFSTransfer(stopsById.get(fromStopId), stopsById.get(toStopId)));
                    }
            );
        }

        return new GTFSDataSet(stationsByName, routesById, stopsById, transfers,
                calendarDataByServiceId, calendarDatesDataByServiceId);
    }

    private static int parseTime(String timeString) {
        String[] timeComponents = timeString.split(":");

        int hours = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);
        int seconds = Integer.parseInt(timeComponents[2]);

        return (hours * 60 + minutes) * 60 + seconds;
    }
}
