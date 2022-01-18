package InheritanceHW004;

public class HWMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.speed = 50;

        System.out.println(" - - - 택시 요금 계산 - - - ");
        Taxi taxi = new Taxi();
        taxi.speedDown(car.speed);
        car.speed = taxi.getSpeed();
        taxi.fare(car.speed);
        taxi.speedUp(car.speed);
        car.speed = taxi.getSpeed();

        System.out.println(" - - - 고속 버스 소요시간 계산 - - - ");
        KoBus koBus = new KoBus();
        koBus.arrivedPlace(koBus.setKmeter(388), car.speed);

    }
}
