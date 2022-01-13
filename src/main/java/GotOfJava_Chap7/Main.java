package GotOfJava_Chap7;

public class Main {
    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        manage.setData();
        int i;
        for(i=1; i<=manage.gradeHeights.length; i++) {
            manage.printAverage(i);
        }
    }

}
