package chap10;

public class Main {

    public static void main(String[] args) {
//        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
//        a.move();
//        a.eatFood();
        d.printEat();
        c.printEat();
        d.move();
        c.move();
    }
}

