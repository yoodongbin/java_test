package chap10;

public class Cat extends Animal{


    public Cat() {
        System.out.println("cat constructor");
    }

    public void printEat() {

        System.out.println("cat<-fish yom yom");
    }

    @Override
    public void move() {
        System.out.println("살금 살금");
        super.move();
    }

}
