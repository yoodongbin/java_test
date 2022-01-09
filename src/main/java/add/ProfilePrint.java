package add;

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

    public static void main(String[] args) {
        ProfilePrint print = new ProfilePrint();
        print.setName("케리니");
        print.setAge((byte) 26);
        print.setMarried(false);
        System.out.println(print.getName());
        System.out.println(print.getAge());
        System.out.println(print.isMarried());

    }


}
