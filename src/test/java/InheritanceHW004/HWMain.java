package InheritanceHW004;

public class HWMain {

    public static void main(String[] args) {
        System.out.println(" - - - 택시 요금 계산 - - - ");
        Taxi taxi = new Taxi(50);
        taxi.fare();
        taxi.speedUp();
        taxi.speedDown();


        System.out.println(" - - - 고속 버스 소요시간 계산 - - - ");
        KoBus koBus = new KoBus(50,388);
        koBus.arrivedPlace();

    }
}
