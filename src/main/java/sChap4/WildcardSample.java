package sChap4;

import chap5.SalaryManager;

public class WildcardSample {

    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.CallBoundedWildcardMethod();
        sample.callGenericMethod();
    }


    private void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("Sdfsdfsdf");
        WildcardMethod(wildcard);
    }

    private void WildcardMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        System.out.println(value);
    }

    public void CallBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard1 = new WildcardGeneric<Car>();
        wildcard1.setWildcard(new Car("BMW"));

        WildcardGeneric<Bus> wildcard2 = new WildcardGeneric<Bus>();
        wildcard2.setWildcard(new Bus("Busss"));

        WildcardMethod(wildcard1);
        WildcardMethod(wildcard2);
    }

    public <T> void genericMehod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public void callGenericMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMehod(wildcard, "Data");
    }

//    public <T extends Car> void boundedGenericMethod(WildcardGeneric<T> c, T addValue, S anothoer) {
//
//    }
}
