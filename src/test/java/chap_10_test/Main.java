package chap_10_test;

public class Main {

    public void objectCast() {

    }

    public static void main(String[] args) {
        System.out.println("1");
        Child child = new Child();
        System.out.println("2");
        Parent parent2 = child;
        System.out.println("3");
        //너 child처럼 행동해 !!!
        Child child2 =(Child)parent2;
        System.out.println("4");
        child2.printName();
    }

}
