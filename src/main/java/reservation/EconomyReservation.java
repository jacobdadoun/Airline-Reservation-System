package reservation;

import Entity.Passenger;

public class EconomyReservation extends AbstractReservation {


    /**
     * @param passenger   takes the customer's name
     * @param flightNo    takes the flight number
     * @param checkedBags takes the number of checked bags
     */
    public EconomyReservation(Passenger<T> passenger, String flightNo, int checkedBags) {
        super(passenger, flightNo, checkedBags);
    }

    @Override
    ReservationType reservationType() {
        return ReservationType.ECONOMY;
    }

    @Override
    String greeting() {
        return String.format("Welcome aboard Economy, %s %s", super.passenger.getFirstName(), super.passenger.getLastName());
    }
}
