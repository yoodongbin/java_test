package InheritanceHW008;

public class Restaurant extends Reservation{

    int waitingTime;

    public Restaurant() {
    }

    public Restaurant(int guest) {
        super(guest);
    }

    @Override
    public void howLongToWait() {
        //예상 웨이팅 시간 : 식당은 손님수 * 30분
        waitingTime = guest*30;
        super.howLongToWait();
        System.out.println("예상 웨이팅 시간은 약"+waitingTime+"분 입니다.");
    }

    @Override
    public int getGuest() {
        System.out.print("현재 대기팀 수 : "+guest+"\n");
        return super.getGuest();
    }
}
