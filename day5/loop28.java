package day5;

// WAJP to check given no is niven no or not
// niven no-> given no is divisible by sum of digit or not 

import java.util.Scanner;

public class loop28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();

        int digitsum=0;
        int temp=n;

        while(temp>0){
            int digit=temp%10;
            digitsum+=digit;
            temp=temp/10;
        }
        if(n % digitsum == 0){
            System.out.println("Yes it is niven no");
        }else{
            System.out.println("It is not niven no");
        }
        sc.close();
    }
}
