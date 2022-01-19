package InheritanceHW004;

public class Car {
    /*
        차 상속 예시
     */
    int speed;
    int kmeter;

    public Car() {
    }

    public Car(int speed, int kmeter) {
        this.speed = speed;
        this.kmeter = kmeter;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        this.speed = speed + 5;
        System.out.println("자동차 속도 "+this.speed+"입니다.");
    }

    public void speedDown() {
        this.speed = speed - 5;
        System.out.println("자동차 속도 "+this.speed+"입니다.");
    }

    public int getSpeed() {
        System.out.println("현재 자동차 속도는 "+speed+"입니다.");
        return speed;
    }

}
