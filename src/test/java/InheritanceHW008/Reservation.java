package InheritanceHW008;
/*
    예약 시스템 !
 */
public class Reservation {

    int guest;
    int waiting;

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    public void confirmReservation() {
        System.out.println("예약이 완료 됐습니다.");
    }

    protected void howLongToWait(int guest) {
    }
}
