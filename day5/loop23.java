package day5;

// WAJP to print prime digit of the given no

import java.util.Scanner;

public class loop23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();

        while(n>0){
            int digit=n%10;
            boolean isprime=true;
            for(int i=2;i<digit;i++){
                if(digit%i==0){
                    isprime=false;
                }
            }
            if(isprime){
                System.out.println(digit);
            }
            n=n/10;
        }
        sc.close();
    }
}
