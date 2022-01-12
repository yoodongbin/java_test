package GotOfJava_Chap4;

public class Main {
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
