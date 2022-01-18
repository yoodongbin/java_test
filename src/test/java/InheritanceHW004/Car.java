package InheritanceHW004;

public class Car {
    /*
        차 상속 예시
     */
    int speed;

    public void speedUp(int speed) {
        this.speed = speed + 5;
        System.out.println("자동차 속도 "+this.speed+"입니다.");
    }

    public void speedDown(int speed) {
        this.speed = speed - 5;
        System.out.println("자동차 속도 "+this.speed+"입니다.");
    }

    public int getSpeed() {
        System.out.println("현재 자동차 속도는 "+speed+"입니다.");
        return speed;
    }

}
