package InheritanceHW007;

public class Bus extends Transfer{

    int allFare;

    public Bus() {
    }

    public Bus(int fare) {
        super(fare);
    }

    //버스로 환승할 시 추가 요금 알려줌
    public void fare() {
        allFare = fare + 300;
        System.out.println("버스 환승 요금은 "+allFare+"입니다.");
    }

}
