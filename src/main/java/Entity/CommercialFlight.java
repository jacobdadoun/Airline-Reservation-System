package Entity;

/**
 * Class CommercialFlight is a flight with passengers.
 * Each flight must have a manifest of the passengers onboard and where they sit.
 */

import java.util.ArrayList;

public class CommercialFlight extends AbstractFlight implements Flight {

    private int flightNo;
    private ArrayList<Passenger> manifest;
    private boolean manifestChanged = false;

    public CommercialFlight(Aircraft airplane, FlightRoute flightRoute, ArrayList<CrewMember> crewMembers, int flightNo, ArrayList<Passenger> manifest){
        super(airplane, flightRoute, crewMembers); // pass to super
        this.flightNo = flightNo;
        this.manifest = manifest;
    }

    @Override
    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    @Override
    public int getFlightNo() {
        return flightNo;
    }

    /**
     * @return full flightNo as a String with the given airline's initials as a prefix
     */
    @Override
    public String concatFlightNo() {
        return String.format("%s%s",getAirlineInitials(), flightNo);
    }

    @Override
    public boolean needsAircraftUpgrade() {
        return getAirplane().getAircraftCapacity() < manifest.size();
    }

    @Override
    public void setNewAircraft(Aircraft newAirplane) {
        setAirplane(newAirplane);
    }

    public void addToManifest(Passenger passengerBeingAdded) {
        manifest.add(passengerBeingAdded);
    }

    public void removeFromManifest(Passenger passengerBeingRemoved) {
        manifest.remove(passengerBeingRemoved);
    }

    public boolean manifestWasChanged(){
        return manifestChanged;
    }

    public void changeFlightManifest(ArrayList<Passenger> manifest) {
        manifestChanged = true;
        this.manifest = manifest;
    }

}
