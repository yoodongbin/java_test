package chap10;

public class Dog extends Animal{

    public Dog() {
        System.out.println("dog constructor");
    }

    public void printEat() {

        System.out.println("dog<-gum yom yom");
    }

    @Override
    public void move() {
        System.out.println("폴짝 폴짝");
        super.move();
    }
}
