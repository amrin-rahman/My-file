# My-file
class Employee {
    String name;
    int id;
    double basicSalary;

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    void displayInfo() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + id);
        System.out.println("Basic Salary : " + basicSalary);
    }
}

class Manager extends Employee {
    String department;
    Manager(String name, int id, double basicSalary, String department) {
        super(name, id, basicSalary); 
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Department : " + department);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee employee = new Employee("Ahmed", 101, 30000);
        System.out.println("Employee Details:");
        employee.displayInfo();

        System.out.println();
        Employee manager = new Manager("Risan", 100, 50000, "IT");
        System.out.println("Manager Details:");
        manager.displayInfo(); 
    }
}
