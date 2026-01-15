package day6;

/* 
WAJP to create calculator using method
1: add 3 variables
2: multiply 2 variables
3: subtract 4 variables
4: divide 2 variables
*/

public class method2 {
    public static void main(String[] args) {
        add(10, 20, 30);
        multiply(5, 4);
        subtract(50, 20, 10, 5);
        divide(100, 5);
    }

    // add 3 variables
    public static void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Addition: " + sum);
    }

    // multiply 2 variables
    public static void multiply(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication: " + mul);
    }

    // subtract 4 variables
    public static void subtract(int a, int b, int c, int d) {
        int sub = a - b - c - d;
        System.out.println("Subtraction: " + sub);
    }

    // divide 2 variables
    public static void divide(int a, int b) {
        int div = a / b;
        System.out.println("Division: " + div);
    }
}
