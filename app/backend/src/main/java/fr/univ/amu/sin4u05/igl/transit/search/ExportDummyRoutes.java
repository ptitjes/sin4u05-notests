package fr.univ.amu.sin4u05.igl.transit.search;

import fr.univ.amu.sin4u05.igl.routes.*;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataLoader;
import fr.univ.amu.sin4u05.igl.transit.gtfs.GTFSDataSet;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExportDummyRoutes {

    public static void main(String[] args) throws IOException {
        new ExportDummyRoutes().allExports();
    }

    public void allExports() throws IOException {
        GTFSDataSet dataSet = GTFSDataLoader.load(new File("data/Gtfs_RTM___2019-02-26.zip"));
        TransitSearch search = new TransitSearch(dataSet);

        List<Route> routes1 = search.search(
                LocalDateTime.parse("2019-03-06T17:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                dataSet.getStationByName("SAINT JEROME FACULTE"),
                dataSet.getStationByName("LUMINY FACULTE"),
                10
        );

        List<Route> routes2 = search.search(
                LocalDateTime.parse("2019-03-06T17:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                dataSet.getStationByName("POINTE ROUGE"),
                dataSet.getStationByName("BELLE DE MAI LA FRICHE"),
                10
        );

        export(Arrays.asList(routes1, routes2));
    }

    private void export(List<List<Route>> routes) {
        write("package fr.univ.amu.sin4u05.igl.dummy;\n" +
                "\n" +
                "import fr.univ.amu.sin4u05.igl.routes.*;\n" +
                "import fr.univ.amu.sin4u05.igl.util.Coordinates;\n" +
                "\n" +
                "import java.time.LocalDateTime;\n" +
                "import java.time.format.DateTimeFormatter;\n" +
                "import java.util.Arrays;\n" +
                "import java.util.List;\n" +
                "\n" +
                "public class DummyRoutes {\n", 0);

        exportBase(routes.stream().flatMap(Collection::stream).collect(Collectors.toList()), 1);

        for (int i = 0; i < routes.size(); i++) {
            List<Route> rs = routes.get(i);
            exportRoutes("ROUTES_" + (i + 1), rs, 1);
            write("\n", 0);
        }

        write("}", 0);
    }

    private void exportBase(List<Route> routes, int depth) {
        Set<TransportLine> lines = routes.stream()
                .flatMap(r -> r.getSteps().stream())
                .map(s -> s.getType() == RouteStepType.Transport ? ((TransportStep) s).getLine() : null)
                .filter(l -> l != null)
                .collect(Collectors.toSet());

        Set<StationStop> stops = routes.stream()
                .flatMap(r -> r.getSteps().stream())
                .flatMap(s -> Stream.of(s.getDepartureStop(), s.getArrivalStop()))
                .collect(Collectors.toSet());

        Set<Station> stations = stops.stream()
                .map(s -> s.getStation())
                .collect(Collectors.toSet());

        write("\n", 0);

        for (Station station : stations) {
            write("private static Station " + stationVar(station) + " = new Station(" + quote(station.getName()) + ");", depth);
        }

        write("\n", 0);

        write("public static final List<Station> ALL_STATIONS = Arrays.asList(", 0);
        write(stations.stream()
                .sorted(Comparator.comparing(Station::getName))
                .map(this::stationVar)
                .collect(Collectors.joining(", ")), 1);
        write(");", 0);

        write("\n", 0);

        for (StationStop stop : stops) {
            write("private static final StationStop " + stopVar(stop) + " = new StationStop(" +
                    stop.getId() + ", " +
                    stationVar(stop.getStation()) + ", " +
                    "new Coordinates" + stop.getCoordinates() +
                    ");", depth);
        }

        write("\n", 0);

        write("public static final List<StationStop> ALL_STOPS = Arrays.asList(", 0);
        write(stops.stream()
                .map(this::stopVar)
                .collect(Collectors.joining(", ")), 1);
        write(");", 0);

        write("\n", 0);

        for (TransportLine line : lines) {
            write("private static final TransportLine " + lineVar(line) + " = new TransportLine(" +
                    quote(line.getShortName()) + ", " +
                    quote(line.getName()) + ", " +
                    "TransportLineType." + line.getType().name() +
                    ");", depth);
        }

        write("\n", 0);
    }

    private void exportRoutes(String name, List<Route> routes, int depth) {
        write("public static final List<Route> " + name + " = Arrays.asList(", depth);
        boolean first = true;
        for (Route route : routes) {
            if (!first) write(",", depth + 1);
            first = false;
            export(route, depth + 1);
        }
        write(");", depth);
    }

    private void export(Route route, int depth) {
        write("new Route(Arrays.asList(", depth);
        boolean first = true;
        for (RouteStep step : route.getSteps()) {
            if (!first) write(",", depth + 1);
            first = false;
            export(step, depth + 1);
        }
        write("))", depth);
    }

    private void export(RouteStep step, int depth) {
        switch (step.getType()) {
            case Transport:
                TransportStep transportStep = (TransportStep) step;

                write("new TransportStep(", depth);
                write(lineVar(transportStep.getLine()) + ",", depth + 1);
                write(quote(transportStep.getHeadSign()) + ",", depth + 1);
                break;
            case Connection:
                ConnectionStep connectionStep = (ConnectionStep) step;
                write("new ConnectionStep(", depth);
                write(connectionStep.getDistance() + ",", depth + 1);
                break;
        }
        write(stopVar(step.getDepartureStop()) + ",", depth + 1);
        write(stopVar(step.getArrivalStop()) + ",", depth + 1);
        write(time(step.getDepartureTime()) + ",", depth + 1);
        write(time(step.getArrivalTime()), depth + 1);
        write(")", depth);
    }

    private String stationVar(Station station) {
        return "station_" + station.getName()
                .replace(" ", "_")
                .replace("-", "_")
                .replace("'", "_");
    }

    private String stopVar(StationStop stop) {
        return "stop" + stop.getId();
    }

    private String lineVar(TransportLine line) {
        return "line" + line.getShortName();
    }

    private String time(LocalDateTime time) {
        return "LocalDateTime.parse(" + quote(time.toString()) + ", DateTimeFormatter.ISO_LOCAL_DATE_TIME)";
    }

    private String quote(String string) {
        return "\"" + string + "\"";
    }

    private void write(String string, int depth) {
        System.out.println(string.lines().map(l -> "    ".repeat(depth) + l).collect(Collectors.joining("\n")));
    }
}
