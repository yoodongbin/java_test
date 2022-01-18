package chap4;
//1월9일
public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte ages) {
        age = ages;
    }

    public void setName(String names) {
        name = names;
    }

    public void setMarried(boolean isMarrieds) {
        isMarried = isMarrieds;
    }

    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }
    @Override
    public String toString() {
        return "ProfilePrint{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
