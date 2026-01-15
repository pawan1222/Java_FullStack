package day7;

import java.util.Scanner;

// WAJP to find count of elements which are divisible by k
public class array7 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();


        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%k==0){
                count++;
            }
        }
        System.out.println("count is : "+count);
        sc.close();
    }
}
