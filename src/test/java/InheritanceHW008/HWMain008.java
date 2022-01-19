package InheritanceHW008;

public class HWMain008 {

    public static void main(String[] args) {
        int guestOfCafe;
        int guestOfRest;

        Cafe cafe = new Cafe(8);
        cafe.confirmReservation();
        cafe.getGuest();
        cafe.howLongToWait();

        System.out.println("-----------------------------------");

        Restaurant rant = new Restaurant(5);
        rant.confirmReservation();
        rant.getGuest();
        rant.howLongToWait();
    }
}
