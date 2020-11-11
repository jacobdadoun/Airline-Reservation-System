package reservation;

import Entity.Passenger;

abstract class AbstractReservation {

    /**
     * customerName, checkedBags and flightNo can only be set once
     */
    protected final Passenger<T> passenger;
    private final int checkedBags;
    private final String flightNo;
    /**
     * seat can be upgraded at request of the customer
     */
    private String seat;
    /**
     * disability can be changed. If a customer gets tired walking through the airport,
     * a wheelchair is needed to bring them onboard.
     */
    private boolean disabled;

    /**
     * @param passenger takes the customer's name
     * @param flightNo takes the flight number
     * @param checkedBags takes the number of checked bags
     */
    public AbstractReservation(Passenger<T> passenger, String flightNo, int checkedBags) {
        this.passenger = passenger;
        this.flightNo = flightNo;
        this.checkedBags = checkedBags;
    }

    // Abstract Methods
    /**
     * @return a string of either: "First Class Reservation", "Economy Reservation", "Standby Reservation"
     */
    abstract ReservationType reservationType();
    abstract String greeting();

    /**
     * setSeat - For use in case a passenger would like to upgrade their seat.
     * @param seat - takes in the customer's seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return a seat as string (i.e. "4A" or "22C")
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @return a customer's name
     */
    public String getCustomerName() {
        return passenger.getFirstName() + passenger.getLastName();
    }

    /**
     * @return number of checked bags
     */
    public int getCheckedBags() {
        return checkedBags;
    }

    /**
     * getSeatNumber uses RegEx to extract the number from the seat variable
     * @return number of a seat
     */
    public int getSeatNumber() {
        return Integer.parseInt(seat.replaceAll("[^0-9]", ""));
    }

    /**
     * getSeatLetter uses RegEx to extract the letter from the seat variable
     * @return letter of a seat
     */
    public String getSeatLetter() {
        return seat.replaceAll("[^A-Z]", "");
    }

    /**
     * setDisabled sets the customer as disabled
     * @param disabled takes the customer's disabled status
     */
    public void setDisabled(boolean disabled){
        this.disabled = disabled;
    }

    /**
     * isDisabled gets the customer's disabled status
     * @return disabled status
     */
    public boolean isDisabled(){
        return disabled;
    }

    public String getFlightNo(){
        return flightNo;
    }

}
