package InheritanceHW007;
/*
    Parents class 임 !
    환승을 위한 부모 클래스 !!!!!!!!!
 */
public class Transfer {
    int fare;
    String type;

    public Transfer() {
    }

    public Transfer(int fare) {
        this.fare = fare;
        System.out.println("기본 운임 요금은 "+fare);
    }
}
