package inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.print();

        Dog dog = new Dog();
        dog.print();

        print(animal);
        print(dog);
        print(cat);
    }

    public static void print(Animal animal){
        System.out.println(animal.getName());
    }
}



class Animal{
    private String name;

    public Animal() {
        this.name = "동물";
    }

    public void print(){
        System.out.println("어흥");
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal{

    public void print(){
        System.out.println("야옹");
    }

}

class Dog extends Animal{
    public void print(){
        System.out.println("멍멍");
    }

}




