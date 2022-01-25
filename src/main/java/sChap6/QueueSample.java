package sChap6;

import java.util.LinkedList;

public class QueueSample {

    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();

    }

    private void checkLinkedList1() {

        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.addFirst("B");
        System.out.println(link);
        link.offerFirst("C");
        System.out.println(link);

        link.addLast("D");
        System.out.println(link);
        link.offer("E");
        System.out.println(link);
        link.offerLast("F");
        System.out.println(link);
        link.push("G"); //가장 앞에 데이터를 추가
        System.out.println(link);
        link.add(0,"H");
        System.out.println(link);
        System.out.println("EX = "+link.set(0,"I")); //<-set은 객체의 특정위치의 데이터를 반환하고 그 위치에 입력한 데이터로 수정
        System.out.println(link);
    }
}
