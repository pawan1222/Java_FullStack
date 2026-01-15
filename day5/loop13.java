package day5;

// WAJP to print given nio is perfect number or not

import java.util.Scanner;

public class loop13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }

        if(sum==n){
            System.out.println("yes it is perfect no");
        }else{
            System.out.println("Not perfect no");
        }

        sc.close();

    }
}
