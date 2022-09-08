public class Employee {
    private final String fullName;
    private int department;
    private double salary;

    private final int id;

    private static int counter = 1;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return this.fullName;
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
        return getId() + ". " + getFullName() + " (" + getDepartment() + " отдел)" + getSalary() + " руб.";
    }
}
