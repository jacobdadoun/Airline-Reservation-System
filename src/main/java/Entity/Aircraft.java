package Entity;

public class Aircraft {
    private String airline;
    private Fleet airplaneModel;

    public Aircraft(String airline, Fleet airplaneModel){
        this.airline = airline;
        this.airplaneModel = airplaneModel;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setAirplane(Fleet airplane) {
        this.airplaneModel = airplane;
    }

    public String getAirline(){
        return airline;
    }

    public Fleet getAirplane(){
        return airplaneModel;
    }

    public int getAircraftCapacity(){
        return airplaneModel.getPassengerCapacity();
    }
}
