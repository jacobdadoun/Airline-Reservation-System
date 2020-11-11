package reservation;

import Entity.Passenger;

public class StandbyReservation extends AbstractReservation {


    /**
     * @param passenger   takes the customer's name
     * @param flightNo    takes the flight number
     * @param checkedBags takes the number of checked bags
     */
    public StandbyReservation(Passenger<T> passenger, String flightNo, int checkedBags) {
        super(passenger, flightNo, checkedBags);
    }

    @Override
    ReservationType reservationType() {
        return ReservationType.STANDBY;
    }

    @Override
    String greeting() {
        return String.format("Welcome aboard Standby, %s %s", super.passenger.getFirstName(), super.passenger.getLastName());
    }
}
