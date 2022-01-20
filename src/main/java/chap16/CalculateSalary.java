package chap16;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calculateSalary = new CalculateSalary();
        calculateSalary.calculateSalaries();

    }
    public long getSalaryIncrease(Employee employee) {
        long salary = employee.getSalary();
        switch (employee.getType()) {
            case 1:
                salary = (long) (salary - (salary*0.05));
                break;
            case 2:
                salary = salary + (long)(salary*0.1);
                break;
            case 3:
                salary = salary + (long)(salary*0.2);
                break;
            case 4:
                salary = salary + (long)(salary*0.3);
                break;
            case 5:
                salary = salary*2;
                break;
        }
        employee.setSalary(salary);
        return salary;
    }
    public void calculateSalaries() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("LeeDaeri",1,1000000000);
        employees[1] = new Employee("KimManager",2,100000000);
        employees[2] = new Employee("WhangDesign",3,70000000);
        employees[3] = new Employee("ParkArchi",4,80000000);
        employees[4] = new Employee("LeeDevelop",5,60000000);
        for(Employee e : employees) {
            getSalaryIncrease(e);
            System.out.println(e.getName() +" : "+e.getSalary());
        }
    }
}
