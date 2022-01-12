package GotOfJava_Chap6;

public class Main {
    public static void main(String[] args) {
        int i;
        int amount = 1000000;
        InterestManager im = new InterestManager();
        for (i = 1; i <= 365; i++) {
            System.out.println(im.calculateAmount(i, amount));
        }
    }
}
