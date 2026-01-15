package day5;


// WAJP to check wheater the given no is prime no or not 

import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();
        boolean flag=false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not prime no");
                flag=true;
            }
        }
        if(!flag){
            System.out.println("yes it is prime no");
        }
        sc.close();
    }
}
