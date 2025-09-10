package assignment_2;

import java.util.ArrayList;

class Employee {
    String name;
    String designation;

    Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void showEmployee() {
        System.out.println("Employee: " + name + ", Designation: " + designation);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class prob_3 {
    public static void main(String[] args) {
        Company c = new Company("Tech Solutions Pvt Ltd");

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        Employee e1 = new Employee("Shivansh", "Developer");
        Employee e2 = new Employee("Ananya", "Tester");
        Employee e3 = new Employee("Rahul", "HR Manager");

        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d2.addEmployee(e3);

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompanyDetails();
    }
}
