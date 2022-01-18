package InheritanceHW004;

public class KoBus extends Car{

    //소요시간 담는 변수
    int time;
    int kmeter;

    public KoBus() {
    }

    public int setKmeter(int kmeter) {
        this.kmeter = kmeter;
        return kmeter;
    }

    //소요시간
    public void arrivedPlace(int kmeter, int speed) {
        this.kmeter = kmeter;
        time = this.kmeter/speed;
        System.out.println("현재 자동차의 속도 "+speed+"(km/h)로 입력하신 "+this.kmeter+"(km)까지 "+time+" 시간 소요됩니다.");
    }
}
