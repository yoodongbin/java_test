package sChap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ManageHeight {

    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list1 = new ArrayList<Integer>();

    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        manage.setData();
        for (int i = 1; i <= 5; i++) {
            manage.printHeights(i);
        }
    }

    public void setData() {

        gradeHeights.add(new ArrayList<Integer>(Arrays.asList(170,180,173,175,177)));

        gradeHeights.add(new ArrayList<Integer>(Arrays.asList(160,165,167,186)));

        gradeHeights.add(new ArrayList<Integer>(Arrays.asList(158,177,187,176)));

        gradeHeights.add(new ArrayList<Integer>(Arrays.asList(173,182,181)));

        gradeHeights.add(new ArrayList<Integer>(Arrays.asList(170,180,165,177,172)));

    }

    public void printHeights(int classNo) {
        System.out.println("Class No. :"+classNo);
            for (int j=0; j<gradeHeights.get(classNo-1).size(); j++) {
                System.out.println(gradeHeights.get(classNo-1).get(j));
        }

    }
}
