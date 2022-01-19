package InheritanceHW004;

public class KoBus extends Car{

    //소요시간 담는 변수
    int time;

    public KoBus() {
    }

    public KoBus(int speed, int meter) {
        super(speed, meter);
    }

    //소요시간
    public void arrivedPlace() {
        time = kmeter/speed;
        System.out.println("현재 자동차의 속도 "+speed+"(km/h)로 입력하신 "+kmeter+"(km)까지 "+time+" 시간 소요됩니다.");
    }
}
