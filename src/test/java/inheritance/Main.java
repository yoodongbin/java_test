package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal<Animal> animal = new Animal();

        Cat<Animal> cat = new Cat();
        cat.print();

        Dog<Dog> dog = new Dog();
        dog.print();

        print(animal);
        print(dog);
        print(cat);
    }
    public static void print(Animal animal) {
        System.out.println(animal.getT());
    }
}
class Cat<T extends Animal> extends Animal<T>{
    public void print(){
        System.out.println("두번 상속해 두번 !제네릭 야옹");
    }
}
class Dog<T> extends Animal<T>{
    public void print(){
        System.out.println("제네릭 멍멍");
    }

}
class Animal<T>{
    T name;
    private String T;
    public Animal() {
        this.T = "제네릭 동물";
    }
    public void print(){
        System.out.println("제네릭 어흥");
    }
    public String getT() {
        return T;
    }
}
//class Animal{
//    private String name;
//    public Animal() {
//        this.name = "동물";
//    }
//    public void print(){
//        System.out.println("어흥");
//    }
//    public String getName() {
//        return name;
//    }
//}
//class Cat extends Animal{
//    public void print(){
//        System.out.println("야옹");
//    }
//}
//
//class Dog extends Animal{
//    public void print(){
//        System.out.println("멍멍");
//    }
//
//}

//    public static void main(String[] args) {
//        Animal<Animal> animal = new Animal();
//
//        Cat<Animal> cat = new Cat();
//        cat.print();
//
//        Dog<Animal> dog = new Dog();
//        dog.print();
//
//        print(animal);
//        print(dog);
//        print(cat);
//    }
//    public static void print(Animal animal){
//        System.out.println(animal.getName());
//    }




