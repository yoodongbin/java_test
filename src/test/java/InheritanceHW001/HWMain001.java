package InheritanceHW001;

public class HWMain001 {

    public static void main(String[] args) {

        Person person = new Person();
        person.sex = "여자";
        genderDivision(person.sex);

        Man man = new Man();
        man.isLongHair = false;
    }

    public static void genderDivision(String sex) {
        if (sex == "남자") {
            System.out.println("성별은 "+sex+"입니다");
        } else {
            System.out.println("성별은 "+sex+"입니다");
        }
    }

}
