package day7;
// WAJP to print perfect elements from the given array
// perfect no= sum of its proper divisors = original no
import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<arr[i];j++){
                if(arr[i] % j == 0){
                    sum+=j;
                }
            }
            if(sum==arr[i]){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
