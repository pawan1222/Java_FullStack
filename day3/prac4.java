// WAP and use switchcase for grading 
package day3;
import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("take input: ");
        String grade=sc.next();

        switch(grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Average");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
        sc.close();
    }
}
