package add;

public class SalaryManager {

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary/12.0;
        monthlySalary -= calculateTax(monthlySalary);
        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        double rmsfh = monthlySalary*0.125;
        double rnrals = monthlySalary*0.081;
        double rjsrkd = monthlySalary*0.135;
        return rmsfh+rnrals+rjsrkd;
    }

    public double calculateNationalPension(double monthlySalary) {
        double rmsfh = monthlySalary*0.125;
        double rnrals = monthlySalary*0.081;
        double rjsrkd = monthlySalary*0.135;
        return rmsfh+rnrals+rjsrkd;
    }

    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();
        sm.getMonthlySalary(20000000);
        System.out.println(sm.getMonthlySalary(20000000));

    }
}
