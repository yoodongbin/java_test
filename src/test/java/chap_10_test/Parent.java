package chap_10_test;

public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }

    public Parent(String name) {
        System.out.println("super 써보고파서 !"+name);
    }

    public void printName() {
        System.out.println("printName - Parent");
    }
}
