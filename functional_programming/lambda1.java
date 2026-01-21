package functional_programming;
/*
What is functional programming?
            A programming paradigm that treats computation as the evaluation of mathematical functions and
            avoids changing state and mutable data.
            Java 8 introduced functional programming features to make java:
                Shorter
                Clearer
                faster
                modern

            Predefined functional interfaces:
                Runnable interface -> run() used in multithreading
                Comparable interface -> compareTo() used in Collection sorting
                Comparator interface -> compare(obj o1, obj o2) used in Collection sorting

            Anonymous class:
                A class without a name is called anonymous class.
                It is used to provide the implementation logic of abstract method of abstract class or interface
                at the time of object creation.
                It is also known as local inner class.
                    to override a method of an existing class
                    to implement an interface

            Lambda expression:
                A lambda expression is an anonymous function that provides implementation of a functional interface.
                A lambda expression is a short way to write a method without name, without class, and without boilerplate code.

            Syntax of lambda expression:
                (parameters) -> expression
                OR
                (parameters) -> {multiple statments}

                Example:
                    (int a, int b) -> {return a+b;}

            Method reference:
                A method reference is a shortcut for a lambda expression that calls a existing method.
                if a lambda expression contains only one statment and that statment is calling as existing method
                then we can use method reference instead of lambda expression
                Syntax:
                    ClassName::methodName

            Example:
                FunctionalInterface1 ref2 = () -> System.out.println("Hello, welcome to Java!");
                ref2.greet();
*/

@FunctionalInterface
interface FI1 {
	void greet();
}
@FunctionalInterface
interface FI2 {
	int add(int a, int b);
}
@FunctionalInterface
interface Factorial {
	int findFactorial(int n);
}
public class lambda1 {
	public static void main(String[] args) {
		Factorial ref = new Factorial() {
			@Override
			public int findFactorial(int n) {
				int fact = 1;
				for(int i=n ; i>=1;i--) {
					fact = fact*i;
				}
				return fact;
			}
		};
		
		System.out.println("Using anonymous class :"+ref.findFactorial(5));
		Factorial obj = (n)-> {
			int fact = 1;
			for(int i=n ; i>=1;i--) {
				fact = fact*i;
			}
			return fact;
		};
		System.out.println("Using lambda :"+ obj.findFactorial(6));
		
        System.out.println("----------------------------------------------");
		FI1 ref1  = new FI1() {
			@Override
			public void greet() {
				System.out.println("Hello world using anonymous class");
			}
		};
		ref1.greet();
		
		FI1 ref2 = () -> System.out.println("Hello world using lambda");
		ref2.greet();
		System.out.println("----------------------------------------------");
		FI2 obj1 = new FI2() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println("Using anonymous class :"+ obj1.add(10, 20));
		
		FI2 obj2 = (a,b) ->  a+b;
		System.out.println("Using lambda exp :"+ obj2.add(20, 30));
	}
}