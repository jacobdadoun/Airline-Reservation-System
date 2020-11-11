package Entity;

/**
 * The Fleet enum class specifies popular aircraft used in the modern industry.
 * The data for each aircraft is referenced from "https://modernairliners.com/"
 *
 * NOTE: When inputting a measurement for wingspan, use the value that excludes "winglets"
 * to help return accurate dimensions in-case of future implementations
 */

public enum Fleet {
    // Presets
    // AIRBUS
    AIRBUS_A321(185, 34.1, 44.51, 5_959.00),
    AIRBUS_A380(555, 79.8, 73.0, 15_000.00),

    // BOEING
    BOEING_737(140, 28.88, 31.01, 4_401.79),
    BOEING_747(605, 68.45, 76.25, 4_390.00),
    BOEING_757(243, 38.05,54.47, 6_658.00),
    BOEING_767(245, 47.6, 61.4,10_418.00),
    BOEING_777(365, 60.9, 73.9, 13_649.00),
    BOEING_787(330, 60.1, 68.3, 11_910.00),

    // BOMBARDIER
    BOMBARDIER_ERJ195(122, 28.72, 38.65, 4_077.00);

    private final int passengerCapacity;
    private final double wingSpan, length, range;
    /**
     * @param passengerCapacity Maximum seating available for the specified aircraft.
     * @param wingSpan Wing span of the aircraft (Meters).
     * @param length Longitude measurement of the fuselage (Meters).
     * @param range Capable distance on a full tank (Kilometers).
     */
    Fleet(int passengerCapacity, double wingSpan, double length, double range){
        this.passengerCapacity = passengerCapacity;
        this.wingSpan = wingSpan;
        this.length = length;
        this.range = range;
    }

    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public double getLength() {
        return length;
    }

    public double getRange() {
        return range;
    }
}
