package day4;
// WAP to perform area calculation
//     circle
//     rectangle
//     triangle
//     square

import java.util.Scanner;

public class prac7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.for circle");
        System.out.println("2.for rectangle");
        System.out.println("3.for triangle");
        System.out.println("4.for square");

        int n=sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("enter radius");
                break;
        
            default:
                break;
        }

        sc.close();
    }
}
