package day5;

// WAJP to check the no is abundant or not
// abundant->sum of its factor is greater than itself

import java.util.Scanner;

public class loop32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the no: ");
        int n=sc.nextInt();


        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Yest it is abundant number");
        }
        else{
            System.out.println("It is not ");
        }
        sc.close();
    }
}
