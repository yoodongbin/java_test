package GotOfJava_Chap5;

public class SalaryManager {
    //1월9일
    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary/12.0;
        monthlySalary -= (calculateTax(monthlySalary)+calculateNationalPension(monthlySalary)+calculateHealthInsurance(monthlySalary));
        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        double calculateTax = monthlySalary*0.125;
        return calculateTax;
    }

    public double calculateNationalPension(double monthlySalary) {
        double nationalPension = monthlySalary*0.081;
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthlySalary) {
        double healthInsurance = monthlySalary*0.135;
        return healthInsurance;
    }



    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();
        sm.getMonthlySalary(20000000);
        System.out.println(sm.getMonthlySalary(20000000));

    }
}
