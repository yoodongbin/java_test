package InheritanceHW007;

public class HWMain007 {
    public static void main(String[] args) {

        Bus bus = new Bus(1250);
        bus.fare();
        System.out.println();
        Subway sub = new Subway(1250);
        sub.fare();

    }
}
