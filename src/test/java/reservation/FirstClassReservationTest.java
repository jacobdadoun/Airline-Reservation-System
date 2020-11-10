package reservation;

import Entity.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstClassReservationTest {

    Passenger passenger = new Passenger("Jacob", "Dadoun");
    FirstClassReservation firstClassReservation = new FirstClassReservation(passenger,"UA417", 2);

    @DisplayName("reservationType()")
    @Test
    void reservationType() {
        Assertions.assertEquals(ReservationType.FIRST_CLASS, firstClassReservation.reservationType());
    }

    @DisplayName("greeting()")
    @Test
    void greeting(){
        Assertions.assertEquals("Welcome aboard First Class, Jacob Dadoun", firstClassReservation.greeting());
    }

}
