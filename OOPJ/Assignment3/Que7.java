class Employee {
    int id;
    String name;
    double salary;
    static int count = 0;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
    }

    double calculateSalary(double allowance) {
        return salary + allowance;
    }

    double calculateSalary(double allowance, double bonus) {
        return salary + allowance + bonus;
    }
}

class Que7 {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Aman", 30000);
        System.out.println(e.calculateSalary(5000));
        System.out.println(e.calculateSalary(5000, 2000));
        System.out.println("Total Employees: " + Employee.count);
    }
}