class Employee {
    private int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }
}

public class PrivateMembers {
    public static void main(String[] args) {
        Employee e = new Employee(30000);
        System.out.println(e.getSalary());
    }
}
