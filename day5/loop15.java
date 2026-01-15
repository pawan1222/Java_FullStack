package day5;

// WAJP to print factorial of given no 

import java.util.Scanner;

public class loop15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

        sc.close();
    }
}
