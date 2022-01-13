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
        return monthlySalary*0.125;
    }
    public double calculateNationalPension(double monthlySalary) {
        return monthlySalary*0.081;
    }
    public double calculateHealthInsurance(double monthlySalary) {
        return monthlySalary*0.135;
    }
}
