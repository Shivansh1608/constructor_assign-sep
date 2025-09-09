package Constructor;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to ₹" + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("-----------------------------");
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);   
        System.out.println("Department: " + department);   
        System.out.println("Salary: ₹" + getSalary());     
        System.out.println("Team Name: " + teamName);
        System.out.println("-----------------------------");
    }
}

public class acess_prob4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        e1.displayEmployeeDetails();
        e1.updateSalary(45000);
        e1.displayEmployeeDetails();

        Manager m1 = new Manager(201, "IT", 70000, "Development Team");
        m1.displayManagerDetails();
        m1.updateSalary(80000);
        m1.displayManagerDetails();
    }
}
