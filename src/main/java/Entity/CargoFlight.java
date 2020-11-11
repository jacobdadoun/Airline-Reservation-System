package Entity;

import java.util.ArrayList;

public class CargoFlight extends AbstractFlight implements Flight {
    public CargoFlight(Aircraft airplane, FlightRoute flightRoute, ArrayList<CrewMember> crewMembers) {
        super(airplane, flightRoute, crewMembers);
    }

    @Override
    public void setFlightNo(int flightNo) {

    }

    @Override
    public int getFlightNo() {
        return 0;
    }

    @Override
    public String concatFlightNo() {
        return null;
    }

    @Override
    public boolean needsAircraftUpgrade() {
        return false;
    }

    @Override
    public void setNewAircraft(Aircraft airplane) {

    }

}
