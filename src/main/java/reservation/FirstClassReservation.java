package reservation;

import Entity.Passenger;

/**
 * Reservation Class
 * Reservation object that contains data for each passenger.
 * Passengers MUST have a reservation to board the flight.
 */
public class FirstClassReservation extends AbstractReservation {


    /**
     * @param passenger    takes the customer's name
     * @param flightNo     takes the flight number
     * @param checkedBags  takes the number of checked bags
     */
    public FirstClassReservation(Passenger<T> passenger, String flightNo, int checkedBags) {
        super(passenger, flightNo, checkedBags);
    }

    @Override
    ReservationType reservationType() {
        return ReservationType.FIRST_CLASS;
    }


    @Override
    String greeting() {
        return String.format("Welcome aboard First Class, %s %s", super.passenger.getFirstName(), super.passenger.getLastName());
    }


}
