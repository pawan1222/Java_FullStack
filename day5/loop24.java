package day5;

// WAJP to print sum of odd and even digit of given no

import java.util.Scanner;

public class loop24 {
    public static void main(String[] args) {
        int oddsum=0;
        int evensum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n=sc.nextInt();

        while(n>0){
            int digit=n%10;

            if(digit%2==0){
                evensum+=digit;
            }else{
                oddsum+=digit;
            }
            n=n/10;
        }
        System.out.println("Even digit sum is "+evensum);
        System.out.println("Odd digit sum is "+oddsum);
        System.out.println("Multiplication of evensum and odd sum is "+evensum*oddsum);

        sc.close();
    }
}
