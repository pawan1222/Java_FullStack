package day3;
import java.util.Scanner;
// WAP to check given day is weekday or weekend


public class prac1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("take input: ");
        String s=sc.next();

        if (s.equals("Monday") || s.equals("Tuesday") || s.equals("Wednesday")
                || s.equals("Thursday") || s.equals("Friday")
                || s.equals("Saturday") || s.equals("Sunday")){
            if(s.equals("Saturday") || s.equals("Sunday")){
                System.out.println("Weekend");
            }else{
                System.out.println("Weekday");
            }
        }else{
            System.out.println("Invalid day");
        }
        sc.close();

    }
}
