package chap_10_test;

public class Child extends Parent{
    //extends 자바의 예약어, parent class를 child까지 확장하겠다는 뜻
    public Child() {
    }

    public void printAge() {
        System.out.println("child-printAge() - 18months");
    }

    public void printName() {
        System.out.println("child-printName()");
    }

    public Child(String name) {
    }

}
