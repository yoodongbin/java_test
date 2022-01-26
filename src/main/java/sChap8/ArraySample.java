package sChap8;

import java.util.Arrays;

public class ArraySample {
    public static void main(String[] args) {
        ArraySample sample = new ArraySample();
//        sample.checkSort();
        sample.checkFill();
    }

    private void checkFill() {
        int[] emptyArray = new int[10];
        Arrays.fill(emptyArray,1);
        Arrays.fill(emptyArray,0,5,9);
        String stringValues = Arrays.toString(emptyArray);
        System.out.println(stringValues);
    }

    private void checkSort() {
        int[] values = new int[]{1,5,3,2,4,7,6,10,8,9};
        Arrays.sort(values);
        for (int i : values
             ) {
            System.out.println(i);
        }
        String stringValues = Arrays.toString(values);
        System.out.println(stringValues);
    }
}
