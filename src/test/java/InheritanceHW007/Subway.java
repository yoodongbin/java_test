package InheritanceHW007;

public class Subway extends Transfer{

    int fare = 500;
    public Subway() {
    }
    //지하철로 환승할 시 추가 요금 알려줌
    public int fare(int fee) {
        fare += fee;
        System.out.println("지하철 환승 요금은 "+fare+"입니다.");
        return fare;
    }

    @Override
    public String changeSomething(String type) {
        System.out.println("subway에서 "+type+"로 환승");
        return super.changeSomething(type);
    }
}
