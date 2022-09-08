public class Employee {
    private final String fio;
    private int department;
    private double salary;

    private final int id;

    private static int counter = 1;

    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override

    public String toSring() {
        return getId() + ". " + getFio() + " (" + getDepartment() + " отдел)" + getSalary() + " руб.";
    }
}
