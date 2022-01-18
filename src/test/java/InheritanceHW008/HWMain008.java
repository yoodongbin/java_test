package InheritanceHW008;

public class HWMain008 {

    public static void main(String[] args) {
        int guestOfCafe;
        int guestOfRest;

        Cafe cafe = new Cafe();
        cafe.confirmReservation();
        cafe.setGuest(8);
        guestOfCafe = cafe.getGuest();
        cafe.howLongToWait(guestOfCafe);

        System.out.println("-----------------------------------");

        Restaurant rant = new Restaurant();
        rant.confirmReservation();
        rant.setGuest(5);
        guestOfRest = rant.getGuest();
        rant.howLongToWait(guestOfRest);
    }
}
