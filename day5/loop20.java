package day5;

// WAJP to print first n fibonacci numbers

import java.util.Scanner;

public class loop20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");     
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
}
