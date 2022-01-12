package GotOfJava_Chap1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        name name = new name();

        System.out.println(name.test_name("더케이") + "\n" + name.test_age(20));

        // 정렬 기능
        // 오름차순 정렬
        List<Integer> notSortedList = Arrays.asList(3,5,2,4,1,7);
        Stream<Integer> streamAsc = notSortedList.stream().sorted();
        // 내림차순 정렬
        Stream<Integer> streamDesc = notSortedList.stream().sorted(Comparator.reverseOrder());
        streamAsc.forEach(System.out::println);
        streamDesc.forEach(System.out::println);
    }
}
