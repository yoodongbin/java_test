package InheritanceHW007;
/*
    질문 거리
    :
        Transfer transfer = new Transfer();
        Subway sub = new Subway();
        Bus bus = new Bus();
        한번만 선언하고 싶어요 ..!
 */
public class HWMain007 {
    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        transfer.getFare();
        Subway sub = new Subway();
        Bus bus = new Bus();
        //지하철로 환승
        sub.changeSomething("subway");
        transferFee("subway", transfer.getFare());
        //버스로 환승
        bus.changeSomething("bus");
        transferFee("bus", transfer.getFare());

    }

    public static void transferFee(String type, int fee) {
        Transfer transfer = new Transfer();
        Subway sub = new Subway();
        Bus bus = new Bus();
        if(type == "subway") {
            sub.fare(fee);
        } else if(type == "bus") {
            bus.fare(fee);
        }else{
            System.out.println("환승이 불가합니다.");
        }
    }
}
