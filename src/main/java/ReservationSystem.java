import Entity.Passenger;
import reservation.FirstClassReservation;

public class ReservationSystem {
    public static void main(String[] args) {
        Passenger<T> passenger = new Passenger<T>("Jacob", "Dadoun");
        FirstClassReservation firstClassReservation = new FirstClassReservation(passenger,"UA417", 2);
        System.out.println(firstClassReservation.getCheckedBags());



    }
}
