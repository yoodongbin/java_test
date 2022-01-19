package InheritanceHW007;

public class Subway extends Transfer{

    int allFare;

    public Subway() {
    }

    public Subway(int fare) {
        super(fare);
    }

    //지하철로 환승할 시 추가 요금 알려줌
    public void fare() {
        allFare = fare + 500;
        System.out.println("지하철 환승 요금은 "+allFare+"입니다.");
    }

}
