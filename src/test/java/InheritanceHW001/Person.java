package InheritanceHW001;

public class Person {
    String sex;
    boolean isLongHair;

    //기본 생성자
    public Person() {
    }

    public Person(String sex, boolean isLongHair) {
        this.sex = sex;
        this.isLongHair = isLongHair;
        System.out.println("성별 : "+sex+" / 긴머리 유무 : "+isLongHair);
    }
}
