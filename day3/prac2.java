package day3;
// WAP to check given year is leap year or not

// it should be leap year if it is divisible by 4 but not divisible by 100

import java.util.Scanner;
public class prac2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("take input: ");
        int year=sc.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("it is leap year");
        }else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
