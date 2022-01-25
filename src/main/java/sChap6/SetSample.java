package sChap6;

import java.util.HashSet;
import java.util.Iterator;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[] {
                "Tico", "Sonata", "BMW", "Benz",
                "Zeep", "Tico", "Sonata", "BMW", "Benz",
                "Zeep", "Tico", "Sonata", "BMW", "Benz",
                "Zeep", "Tico", "Sonata", "BMW", "Benz",
                "Zeep"
        };
        System.out.println(sample.getCarKinds(cars));



    }


    private int getCarKinds(String[] cars) {

        if(cars==null) {return 0; }
        if(cars.length == 1) { return 1;}
        HashSet<String> carSet = new HashSet<String>();
        for (String car : cars) {
            carSet.add(car);
        }

        for (String temp : cars) {
            System.out.print(temp+" ");
        }
        System.out.println();


        printCarSetIte(carSet);


        return carSet.size();
    }

    private void printCarSetIte(HashSet<String> carSet) {
        Iterator<String> ite = carSet.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next()+" ");
        }
        System.out.println();
    }

}
