package day5;

// WAJP to check special no 
// sum of digit and product of digit is equal to our original no

/*
import java.util.Scanner;

public class loop27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int product=1;
        while (temp>0) {
            int digit=temp%10;
            sum+=digit;
            product*=digit;
            temp=temp/10;
        }
        if(sum+product==n){
            System.out.println("yes it is special number: "+n);
        }
        sc.close();
    }
}
 */


//print special no in range 1 to 100

public class loop27 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            int temp=i;
            int sum=0;
            int product=1;
            while (temp>0) {
                int digit=temp%10;
                sum+=digit;
                product*=digit;
                temp=temp/10;
            }
            if(sum+product==i){
                System.out.println("yes it is special number: "+i);
            }
        }
    }
}