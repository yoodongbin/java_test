package GotOfJava_Chap3;

public class Main {
    public static void main(String[] args) {
        //carculator 실행
        calculator cal = new calculator();
        int a = 5;
        int b = 3;

        System.out.println(cal.add(a, b));
        System.out.println(cal.sub(a, b));
        System.out.println(cal.multi(a, b));
        System.out.println(cal.divide(a, b));

        System.out.println("------------------------------------------------");
        //car 실행
        car car = new car();
        car.speedUp();
        car.speedDown();
        System.out.println(car.getCurrentSpeed());
    }
}
