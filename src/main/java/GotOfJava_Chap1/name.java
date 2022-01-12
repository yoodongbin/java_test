package GotOfJava_Chap1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class name {

	public static String test_name(String name) {
		String names = "my name is ";
		return names + name;
	}

	public static String test_age(int age) {
		String ages = "my age is ";
		return ages + age;
	}

	public static void main(String[] args) {
		System.out.println(test_name("더케이") + "\n" + test_age(20));

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
