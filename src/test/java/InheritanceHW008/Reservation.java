package InheritanceHW008;
/*
    예약 시스템 !
 */
public class Reservation {

    int guest;
    int waitingTime;

    public Reservation() {
    }

    public Reservation(int guest) {
        this.guest = guest;
    }

    public int getGuest() {
        return guest;
    }

    public void confirmReservation() {
        System.out.println("예약이 완료 됐습니다.");
    }

    protected void howLongToWait() {

    }
}
