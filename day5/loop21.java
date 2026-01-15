package day5;

// WAJP to print digit of the given number

import java.util.Scanner;

public class loop21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");   
        int n=sc.nextInt();
        System.out.println("The digits of the number are:");

        while(n>0){
            int digit=n%10;
            System.out.println(digit);
            n=n/10;
        }
        sc.close();
    }
}
