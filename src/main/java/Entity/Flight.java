package Entity;

/**
 * All fields are automatically public, static, and final, and all methods that you declare or define
 * (as default methods) are public.
 *
 * This is in an interface because there are 2 types of flight numbers.
 * 1. Commercial - can have any mix of a 4 digit flight number (1738)
 * 2. Cargo - can have the number 28 and any mix of 2 digits behind it (28xx)
 */
public interface Flight {


    void setFlightNo(int flightNo);

    int getFlightNo();

    String concatFlightNo();

    boolean needsAircraftUpgrade();

    void setNewAircraft(Aircraft airplane);
}
