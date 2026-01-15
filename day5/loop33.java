package day5;

// WAJP to compare sum of first and last digit to sum of middles of digits 

import java.util.Scanner;

public class loop33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the no: ");
        int n=sc.nextInt();

        int out=n%10;
        n=n/10;
        int in=0;

        while(n>10){
            int digit=n%10;
            in+=digit;
            n=n/10;
        }
        out=out+n;
        if(out==in){
            System.out.println("yes it is equal");
        }
        else{
            System.out.println("not equal");
        }
        sc.close();
    }
}
