package GotOfJava_Chap5;

public class SalaryManager {
    //1월9일
    double monthlySalary;
    double tax;
    public double getMonthlySalary(int yearlySalary) {
        monthlySalary = yearlySalary/12.0;
        tax += calculateTax(monthlySalary);
        tax += calculateNationalPension(monthlySalary);
        tax += calculateHealthInsurance(monthlySalary);
        monthlySalary -= tax;
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
}
