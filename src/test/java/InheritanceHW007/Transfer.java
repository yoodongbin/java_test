package InheritanceHW007;
/*
    Parents class 임 !
    환승을 위한 부모 클래스 !!!!!!!!!
 */
public class Transfer {
    int fare = 1250;

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String changeSomething(String type) {
//        System.out.println(type+"으로 환승");
        return type;
    }

}
