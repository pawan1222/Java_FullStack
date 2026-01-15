package day7;


// WAJP to print prime elements from the given array

import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element in the array ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            boolean isPrime=true;
            if (arr[i] <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= arr[i] / 2; j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
