package InheritanceHW004;

public class Taxi extends Car{

    int fare;

    public Taxi() {
    }

    public Taxi(int speed) {
        super(speed);
    }

    //택시 요금 계산, 임의로 속도에 1000을 곱해줌
    public void fare() {
        fare = speed*1000;
        System.out.println("현재 요금은 "+fare+"입니다.");
    }
}
