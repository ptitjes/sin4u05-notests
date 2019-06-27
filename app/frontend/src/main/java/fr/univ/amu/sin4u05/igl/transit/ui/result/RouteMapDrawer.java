package fr.univ.amu.sin4u05.igl.transit.ui.result;

import com.lynden.gmapsfx.javascript.event.MapStateEventType;
import com.lynden.gmapsfx.javascript.object.*;
import com.lynden.gmapsfx.shapes.Polyline;
import com.lynden.gmapsfx.shapes.PolylineOptions;
import fr.univ.amu.sin4u05.igl.routes.StationStop;
import fr.univ.amu.sin4u05.igl.routes.Route;
import fr.univ.amu.sin4u05.igl.routes.RouteStep;
import fr.univ.amu.sin4u05.igl.routes.RouteStepType;
import fr.univ.amu.sin4u05.igl.routes.TransportStep;
import fr.univ.amu.sin4u05.igl.routes.TransportLine;
import fr.univ.amu.sin4u05.igl.transit.ui.util.StopIterator;
import fr.univ.amu.sin4u05.igl.util.Coordinates;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.concurrent.Task;
import javafx.scene.paint.Color;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class RouteMapDrawer {

    private static final Color WALK_COLOR = Color.valueOf("lightgrey");

    private final GoogleMap map;
    private List<MapShape> shapes = new ArrayList<>();

    public RouteMapDrawer(GoogleMap map,
                          ReadOnlyObjectProperty<Route> selectedRoute,
                          SimpleMapProperty<TransportLine, Color> colorMap) {

        this.map = map;

        selectedRoute.addListener((observable, oldValue, newValue) -> drawRoute(newValue, colorMap));
    }

    private void drawRoute(Route route, SimpleMapProperty<TransportLine, Color> colorMap) {

        if (!shapes.isEmpty()) {
            for (MapShape shape : shapes) {
                map.removeMapShape(shape);
            }
            shapes.clear();
        }

        if (route == null) return;

        map.fitBounds(computeNewShapes(route, colorMap));

        map.addStateEventHandler(MapStateEventType.bounds_changed, () -> {
            for (MapShape shape : shapes) {
                map.addMapShape(shape);
            }
        });
    }

    @NotNull
    private LatLongBounds computeNewShapes(Route route, SimpleMapProperty<TransportLine, Color> colorMap) {
        LatLongBounds bounds = new LatLongBounds();

        List<RouteStep> steps = route.compressRoute().getSteps();
        for (RouteStep step : steps) {
            MVCArray path = new MVCArray();

            StopIterator stops = new StopIterator(step.getStepDetails());
            while (stops.next()) {
                StationStop stop = stops.current();

                LatLong coordinates = latLong(stop);

                path.push(coordinates);
                bounds.extend(coordinates);
            }

            Color color = colorFor(step, colorMap);
            shapes.add(new Polyline(coloredLineOptions(path, color)));
        }
        return bounds;
    }

    private Color colorFor(RouteStep step, SimpleMapProperty<TransportLine, Color> colorMap) {
        boolean isTransportStep = step.getType() == RouteStepType.Transport;
        return isTransportStep ? colorMap.get(((TransportStep) step).getLine()) : WALK_COLOR;
    }

    @NotNull
    private LatLong latLong(StationStop stop) {
        Coordinates coordinates = stop.getCoordinates();
        return new LatLong(coordinates.latitude, coordinates.longitude);
    }

    private PolylineOptions coloredLineOptions(MVCArray currentPath, Color color) {
        return new PolylineOptions().
                strokeColor(toHex(color))
                .strokeWeight(5)
                .path(currentPath)
                .geodesic(true)
                .clickable(false)
                .editable(false)
                .draggable(false);
    }

    private String toHex(Color color) {
        int r = (int) Math.round(color.getRed() * 255.0);
        int g = (int) Math.round(color.getGreen() * 255.0);
        int b = (int) Math.round(color.getBlue() * 255.0);
        int o = (int) Math.round(color.getOpacity() * 255.0);
        return String.format("#%02x%02x%02x%02x", r, g, b, o);
    }
}
