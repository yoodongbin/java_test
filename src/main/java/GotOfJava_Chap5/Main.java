package GotOfJava_Chap5;

public class Main {
    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();

        int yearlySalary = 20000000;

        sm.getMonthlySalary(yearlySalary);
        System.out.println("print : salarymanager");
        System.out.println(sm.getMonthlySalary(yearlySalary));
    }
}
