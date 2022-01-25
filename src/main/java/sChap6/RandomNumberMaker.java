package sChap6;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {

    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        for (int i =0; i<=9; i++){
            maker.getSixNumber();
        }
    }

    public HashSet<Integer> getSixNumber() {


        HashSet<Integer> sixNumber = new HashSet<>();
        while (sixNumber.size() != 6) {
            Random random = new Random();
            int tempNumber = random.nextInt(45);
            sixNumber.add(tempNumber);
        }
        System.out.println(sixNumber);

        return sixNumber;
    }

}
