class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void updateSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Updated Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", "Manager", 30000);

        System.out.println("Name: " + e.name);
        System.out.println("Job Title: " + e.jobTitle);

        e.calculateSalary();
        e.updateSalary(40000);
    }
}
