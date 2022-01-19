package InheritanceHW006;

public class Train {

    //입석 가능 여부
    int isStanding;
    //승객수
    int passenger;

    public Train() {
    }

    public Train(int isStanding, int passenger) {
        this.isStanding = isStanding;
        this.passenger = passenger;
        System.out.println("현재 승객수는 : "+(this.isStanding+this.passenger));
    }

    public Train(int passenger) {
        this.passenger = passenger;
        System.out.println("현재 승객수는 : "+this.passenger+"명 입니다. 입석이 불가한 기차입니다.");
    }
}
