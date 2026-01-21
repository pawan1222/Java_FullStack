package functional_programming;
import java.util.*;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
    }
}


public class method_reference2 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Alice", 50000),
            new Employee(2, "Bob", 60000),
            new Employee(3, "Charlie", 70000)
        );

        System.out.println(employees);

        // using lambda expression to print employee details
        employees.forEach(emp -> emp.display());
        // Using method reference to print employee details
        employees.forEach(Employee::display);
        
    }
}
