package Entity;

import java.util.ArrayList;

/**
 * Abstract class Flight is a parent to different kinds of flights(i.e. CommercialFlight and CargoFlight).
 *
 * getAirlineInitials() is not subject to a specific flight type because Airlines can do cargo
 * runs as well (as seen during COVID-19)
 */

public abstract class AbstractFlight<T> {
    private Aircraft airplane;
    private FlightRoute flightRoute;
    private ArrayList<CrewMember> crewMembers;

    public AbstractFlight(Aircraft airplane, FlightRoute flightRoute, ArrayList<CrewMember> crewMembers){
        this.airplane = airplane;
        this.flightRoute = flightRoute;
        this.crewMembers = crewMembers;
    }

    public void setAirplane(Aircraft airplane){
        this.airplane = airplane;
    }

    public Aircraft getAirplane() {
        return airplane;
    }

    public void setFlightRoute(FlightRoute flightRoute) {
        this.flightRoute = flightRoute;
    }

    public FlightRoute getFlightRoute() {
        return flightRoute;
    }

    public void changeCrew(ArrayList<CrewMember> crewMembers){
        this.crewMembers = crewMembers;
    }

    public ArrayList<CrewMember> getCrewMembers(){
        return crewMembers;
    }

    public String getAirlineInitials()
    {
        String airline = airplane.getAirline();
        String result = "";

        // Traverse the string.
        boolean v = true;
        for (int i = 0; i < airline.length(); i++)
        {
            // If it is space, set v as true.
            if (airline.charAt(i) == ' ')
            {
                v = true;
            }

            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false.
            else if (airline.charAt(i) != ' ' && v)
            {
                result += (airline.charAt(i));
                v = false;
            }
        }
        return result;
    }
}
