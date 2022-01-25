package sChap6;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
    int total = 0;
    public static void main(String[] args) {
        RandomNumberStatistics statistics = new RandomNumberStatistics();
        statistics.getRandomNumberStatistics();
        statistics.printStatistics();
    }

    private void printStatistics() {
        Set<Integer> key = hashtable.keySet();
        for (int temp:key) {
            System.out.print(temp+" = "+hashtable.get(temp)+"   ");
            total += hashtable.get(temp);
            if (temp % 10 - 1 == 0) {
                System.out.println();
            }
        }
        System.out.println("value의 총합은 오천일까 ? "+total);
    }

    private void getRandomNumberStatistics() {
        for (int i=1; i<=5000; i++){
            Random random = new Random();
            int temp = random.nextInt(DATA_BOUNDARY);
            putCurrentNumber(temp);
       }
    }

    private void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber)+1);
        } else {
            hashtable.put(tempNumber, 1);
        }

    }
}
