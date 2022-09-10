public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, Math.ceil(Math.random() * 2000));
        employees[1] = new Employee("Семенов Семен Семенович", 2, Math.ceil(Math.random() * 2000));
        employees[2] = new Employee("Федоров Федор Федорович", 5, Math.ceil(Math.random() * 2000));
        employees[3] = new Employee("Дмитриев Дмитрий Дмитриевич", 3, Math.ceil(Math.random() * 2000));
        employees[4] = new Employee("Васильев Василий Васильевич", 4, Math.ceil(Math.random() * 2000));
        employees[5] = new Employee("Петров Петр Петрович", 5, Math.ceil(Math.random() * 2000));
        employees[6] = new Employee("Андреев Андрей Андреевич", 1, Math.ceil(Math.random() * 2000));
        employees[7] = new Employee("Константинов Константин Константинович", 2, Math.ceil(Math.random() * 2000));
        employees[8] = new Employee("Витальев Виталий Витальевич", 3, Math.ceil(Math.random() * 2000));
        employees[9] = new Employee("Евгенин Евгений Евгеньевич", 4, Math.ceil(Math.random() * 2000));


        System.out.println();
        System.out.println("Сумма затрат на зарплату сотрудников в месяц " + getSum() + " руб.");
        getMinPay();
        getMaxPay();
        System.out.println("Среднее значение зарплат сотрудников " + averageSalary() + " руб.");
        System.out.println();

    }


    private static double getSum() {
        double sum = 0;
        for (Employee value : employees) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    private static void getMaxPay() {
        String expensiveEmployee = "";
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                expensiveEmployee = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + expensiveEmployee);
    }

    private static void getMinPay() {
        String cheapEmployee = " ";
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                cheapEmployee = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + cheapEmployee);
    }

    private static double averageSalary() {

        return Math.ceil(getSum() / employees.length);
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
        System.out.println();
    }


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}

