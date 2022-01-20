package chap16;

public class Employee {

    String name;
    int type;
    private long salary;

    public Employee() {
    }

    public Employee(String name, int type, long salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
