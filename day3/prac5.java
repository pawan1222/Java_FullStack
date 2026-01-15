package day3;
// WAP to perform Arithemetic operations using switch and user choice.
// addition 
//     add 2 variable 
//     add 3 variable
//     add 4 variable
// subtraction
//     sub 2 variable
//     sub 3 variable
//     sub 4 variable
// multiplication
//     mul 2 variable
//     mul 3 variable
//     mul 4 variable
// division
//     divide 2 variable


import java.util.Scanner;
public class prac5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter two numbers to add: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println("Sum: " + (a+b));
                break;
            case 2:
                System.out.println("Enter two numbers to subtract: ");
                int c=sc.nextInt();
                int d=sc.nextInt();
                System.out.println("Difference: " + (c-d));
                break;
            case 3:
                System.out.println("Enter two numbers to multiply: ");
                int e=sc.nextInt();
                int f=sc.nextInt();
                System.out.println("Product: " + (e*f));
                break;
            case 4:
                System.out.println("Enter two numbers to divide: ");
                int g=sc.nextInt();
                int h=sc.nextInt();
                if(h!=0){
                    System.out.println("Quotient: " + (g/h));
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
