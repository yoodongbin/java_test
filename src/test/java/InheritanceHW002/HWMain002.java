package InheritanceHW002;

public class HWMain002 {

    public static void main(String[] args) {
        System.out.println("칵테일 만들기");

        Alcohol alcohol = new Alcohol();
        Rum rum = new Rum();
        Whisky whisky = new Whisky();

        rum.getABV = 12.6;
        whisky.getABV = 15.1;
        alcohol.mixedAlcohol(rum.getABV,whisky.getABV);

    }

}
