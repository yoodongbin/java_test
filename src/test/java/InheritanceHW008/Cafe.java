package InheritanceHW008;

public class Cafe extends Reservation{

    int waitingTime;

    public Cafe() {
    }

    public void howLongToWait(int guest) {
        //예상 웨이팅 시간 : 카페는 손님수 * 10분
        waitingTime = guest*10;
        super.howLongToWait(guest);
        System.out.println("예상 웨이팅 시간은 약"+waitingTime+"분 입니다.");
    }

    @Override
    public int getGuest() {
        System.out.print("현재 대기팀 수 : "+guest+"\n");
        return super.getGuest();
    }
}
