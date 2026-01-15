package Collections;

/*
Q. You are given a Java program that defines two classes: Employee and Company.
- The Employee class has attributes for employee ID, name, and salary. It also 
contains a static method to create new Employee objects and a method to display 
employee details.
- The Company class maintains a list of employees and displays their details.
*/

import java.util.*;

public class List6 {
    public static void main(String[] args) {
       Company company = new Company();

        Employee e1 = Employee.createEmployee(101, "Amit", 50000);
        Employee e2 = Employee.createEmployee(102, "Neha", 60000);
        Employee e3 = Employee.createEmployee(103, "Rohit", 55000);

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.displayEmployees();
    }
}

class Employee {
    int empId;
    String name;
    double salary;

    private Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public static Employee createEmployee(int empId, String name, double salary) {
        return new Employee(empId, name, salary);
    }

    public void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}



class Company {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void displayEmployees() {
        for (Employee e : employees) {
            e.display();
        }
    }
}