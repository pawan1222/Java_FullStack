package day5;

// WAJP to sum of disits with their power 

import java.util.Scanner;

public class loop34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the no: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int pow_count=1;
        while(n>0){
            n=n/10;
            pow_count++;
        }
        
        while(temp>0){
            int digit=temp%10;
            sum=sum+(digit^pow_count);
            pow_count--;
            temp=temp/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
