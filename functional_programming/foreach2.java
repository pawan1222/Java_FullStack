package functional_programming;

import java.util.Arrays;
import java.util.*;

/*
WAJP to print objects that ends with "sh" form names list using forEach and lambda expression.
WAJP to print only even objects from numbers list using forEach and lambda expression.
WAJP to print details who got marks more than 85. 
*/
class Students {
    int id;
    String name;
    double marks;
    
    Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
public class foreach2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kabir","Devansh","Girish","Nitish","Murali");
		System.out.println("NAMES: "+ names);
		
		names.forEach(name -> {
			if (name.endsWith("sh")) {
				System.out.println(name);
			}
		});
		
		List<Integer> numbers = Arrays.asList(10,21,24,32,23,14,15);
		System.out.println("\nNUMBERS: "+ numbers);
		
		numbers.forEach(num -> {
			if (num%2==0) {
				System.out.println(num);
			}
		});
		
		List<Students> st = List.of(
				new Students(3, "Murali", 75.5),
				new Students(4, "Aditya", 85.5),
				new Students(1, "Vishnu", 80.5),
				new Students(2, "Pramod", 90.5));
		System.out.println("\nStudents: "+ st);
		
		st.forEach(student -> {
			if (student.marks > 85.0) {
				System.out.println(student);
			}
		});
				
	}
}
