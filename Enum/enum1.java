package Enum;
/*
Q. Online Order Processing System
Each Order has:
	int orderId
	String customerName
	double orderAmount
	int itemCount
	long orderTime

Write a Java program to sort orders using Comparator based on:
	Higher orderAmount first
	If amount same → fewer itemCount first
	If itemCount same → earlier orderTime first
	If orderTime same → customerName in ascending order
	If customerName same → orderId in ascending order



    enum Student_Names {
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;
}
public class P9 {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("\n--All values of enum--");
		Student_Names[] students_names = Student_Names.values();
		for(Student_Names name:students_names) {
			System.out.println(name);
		}
		System.out.println("main end");
	}
}



import java.util.Scanner;

enum Student_Names {
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;
}
public class P9 {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value: ");
		String find = sc.next();
		Student_Names f = Student_Names.valueOf(find);
		Student_Names[] names = Student_Names.values();
		for(Student_Names name : names) {
			if (f==name) {
				System.out.println(find+" is present"+name.ordinal());
			}
		}
		
		System.out.println("main end");
	}
}
*/
public class enum1 {
    
}
