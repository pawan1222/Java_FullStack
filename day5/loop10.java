package day5;

// WAJP to print factor of a given number

import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
