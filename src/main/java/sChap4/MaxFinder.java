package sChap4;

public class MaxFinder {

    public void testGetMax() {
        System.out.println(getMax(1,2,3));
        System.out.println(getMax(3,1,2));
        System.out.println(getMax(2,3,1));
        System.out.println(getMax("a","b","c"));
        System.out.println(getMax("b","c","a"));
        System.out.println(getMax("c","b","a"));
        System.out.println("--------------------------------------------");
        System.out.println(getMin(1,2,3));
        System.out.println(getMin(3,1,2));
        System.out.println(getMin(2,3,1));
        System.out.println(getMin("a","b","c"));
        System.out.println(getMin("b","c","a"));
        System.out.println(getMin("c","b","a"));
    }

/*
        compareTo 는 주어진 객체의 순서를 비교한다.
        객체가 주어진 객체보다 작으면 음의 정수, 같으면 0, 크면 양의 정수를 반환한다. 따라서 다음의 test 가 통과한다 만약 비교할 수 없는 타입이 주어지면 ClassCastException 이 발생한다.
 */

    private <T extends Comparable<T>> T getMax(T ... a) {
        T maxT = a[0];
        for (T tempT:a) {
            if (tempT.compareTo(maxT)>0) maxT = tempT;
        }
        return maxT;
    }

    private <T extends Comparable<T>> T getMin(T ... a) {
        T minT = a[0];
        for (T tempT:a) {
            if (tempT.compareTo(minT)<0) minT = tempT;
        }
        return minT;
    }

    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();
        maxFinder.testGetMax();

    }

}
