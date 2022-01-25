package sChap5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

public class ListSample {

    public static void main(String[] args) {
        ListSample sample = new ListSample();
//        sample.checkArrayList1();
//        sample.checkArrayList2();
//        sample.checkArrayList3();
//        sample.checkArrayList4();
        sample.checkStack();
    }

    private void checkArrayList1() {
//        ArrayList list1 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("오늘은");
        list1.add("피티 날");
//        list1.add(123);
        System.out.println(list1);
    }

    private void checkArrayList2() {
        ArrayList<String> list = new ArrayList<String>(10);
        list.add("오늘은");
        list.add("피티 날");
        list.add("둑근둑근");
        list.add("하체 데이");
        list.add("신나 ~~~ ");

//        ArrayList<String> list2 = new ArrayList<String>();
//        list2.add("0  ");
//        list2.addAll(list);
        ArrayList<String> list2 = new ArrayList<String>(list);
        for (String temp:list2
             ) {
            System.out.println("addAll : "+temp);
        }
    }

    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("Ab");
//        list.add("An");
//        list.add("Ad");
//        list.add("Ae");
//        int listSize = list.size();
//        for (String temp:list
//             ) {
//            System.out.println("list.get("+temp+")="+list.indexOf(temp));
//        }

        //매개변수로 넘긴 객체에 값을 담아보냄 ! new String[0]기입 안 할 시, null로 값이 들어가고, 저렇게 해주면 0으로 들어감
        String[] tempArray = new String[7];
        String[] strList = list.toArray(tempArray);
        for (String temp:strList
             ) {
            System.out.println(temp);
        }

    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> rm_temp = new ArrayList<String>();
        list.add("A");
        list.add("Ab");
        list.add("An");
        list.add("Ad");
        list.add("Ae");
        list.add("A");
        list.add("Ab");
        list.add("An");
        list.add("zd");

        rm_temp.add("zd");
        System.out.println("Removed : "+list.removeAll(rm_temp));
        for (String temp:list
        ) {
            System.out.println(temp);
        }
    }

    public void checkStack() {
        Stack<Integer> intStack = new Stack<Integer>();

        for (int i = 0; i < 5; i++) {
            intStack.push(i);
            System.out.println(intStack.peek());
        }
        while (!intStack.empty()) {
            System.out.println(intStack.pop());
        }
//
//        for (int temp:intStack
//             ) {
//            intStack.push(temp);
//            System.out.println(intStack.peek());
//        }
    }

}
