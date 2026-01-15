package day7;

import java.util.Scanner;

// WAJP to print product of the aray
public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int product=1;
        for(int i=0;i<n;i++){
            product*=arr[i];
        }
        System.out.println(product);
        sc.close();
    }
}
