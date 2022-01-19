package InheritanceHW002;

public class HWMain002 {

    public static void main(String[] args) {
        System.out.println("칵테일 만들기");

        Alcohol alcohol = new Alcohol();
        Rum rum = new Rum("rum", 12.5);
        Whisky whisky = new Whisky("whisky", 8.1);

        alcohol.mixedAlcohol(rum.getABV,whisky.getABV);
    }
}
