package fr.univ.amu.sin4u05.igl.transit.ui;

import fr.univ.amu.sin4u05.igl.routes.TransportLineType;
import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.material.Material;

import java.util.EnumMap;

public class UIConstants {

    public final static EnumMap<TransportLineType, Ikon> LINE_TYPE_ICONS = new EnumMap<>(TransportLineType.class);

    static {
        LINE_TYPE_ICONS.put(TransportLineType.Tramway, Material.DIRECTIONS_TRANSIT);
        LINE_TYPE_ICONS.put(TransportLineType.Subway, Material.DIRECTIONS_SUBWAY);
        LINE_TYPE_ICONS.put(TransportLineType.Rail, Material.DIRECTIONS_RAILWAY);
        LINE_TYPE_ICONS.put(TransportLineType.Bus, Material.DIRECTIONS_BUS);
        LINE_TYPE_ICONS.put(TransportLineType.Ferry, Material.DIRECTIONS_BOAT);
        LINE_TYPE_ICONS.put(TransportLineType.CableTram, Material.DIRECTIONS_TRANSIT);
        LINE_TYPE_ICONS.put(TransportLineType.AerialLift, Material.DIRECTIONS_TRANSIT);
        LINE_TYPE_ICONS.put(TransportLineType.Funicular, Material.DIRECTIONS_TRANSIT);
    }
}
