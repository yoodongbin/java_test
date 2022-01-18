package chap_10_test;

public class Main {

    public void objectCast() {

    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent2 = child;
        //너 child처럼 행동해 !!!
        Child child2 =(Child)parent2;
        child2.printName("케린이");
    }

}
