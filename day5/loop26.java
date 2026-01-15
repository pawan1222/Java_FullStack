package day5;

// WAJP to print second smallest digit in the given no

import java.util.Scanner;
/* 
public class loop26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=sc.nextInt();

        int smallest=9;
        int sec_smallest=9;

        while(n>0){
            int digit=n%10;
            if(smallest>digit){
                sec_smallest=smallest;
                smallest=digit;
            }
            n=n/10;
        }

        System.out.println("The second smallest digit is: "+sec_smallest);
        sc.close();
    }
}
*/

// WAJP to print second largest digit in the given no

public class loop26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=sc.nextInt();

        int largest=0;
        int sec_largest=0;

        while(n>0){
            int digit=n%10;
            if(largest<digit){
                sec_largest=largest;
                largest=digit;
            }
            n=n/10;
        }

        System.out.println("The second largest digit is: "+sec_largest);
        sc.close();
    }
}