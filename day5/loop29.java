package day5;

// print factorial of all digit of given no 

import java.util.Scanner;

public class loop29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();

        while(n>0){
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            System.out.println(fact);
            n/=10;
        }
        sc.close();
    }
}
