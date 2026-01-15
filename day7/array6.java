package day7;

import java.util.Scanner;
// WAJP to find smallest element
public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int smallest=Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("smallest is : "+smallest);
        sc.close();
    }
}
