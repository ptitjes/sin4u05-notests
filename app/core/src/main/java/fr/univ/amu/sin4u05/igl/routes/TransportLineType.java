package fr.univ.amu.sin4u05.igl.routes;

/**
 * The type of a transport line.
 */
public enum TransportLineType {
    Tramway(0, "Tram, Streetcar, Light rail"),
    Subway(1, "Subway, Subway"),
    Rail(2, "Rail"),
    Bus(3, "Bus"),
    Ferry(4, "Ferry"),
    CableTram(5, "Cable tram"),
    AerialLift(6, "Aerial lift"),
    Funicular(7, "Funicular");

    private static TransportLineType[] byCode = new TransportLineType[]{
            Tramway, Subway, Rail, Bus, Ferry, CableTram, AerialLift, Funicular
    };

    /**
     * Returns the transport line type for the given GTFS code.
     *
     * @param code the GTFS code of a transport line type.
     * @return the corresponding transport line type.
     */
    public static TransportLineType byCode(int code) {
        return TransportLineType.byCode[code];
    }

    private final int code;
    private final String name;

    TransportLineType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Returns the GTFS code of the line type.
     *
     * @return the GTFS code of the line type.
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns the name of the line type.
     *
     * @return the name of the line type.
     */
    public String getName() {
        return name;
    }
}
