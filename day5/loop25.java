package day5;

// WAJP to find smallest digit 


import java.util.Scanner;
/* 


public class loop25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=sc.nextInt();

        int smallest=Integer.MAX_VALUE;

        while(n>0){
            int digit=n%10;
            if(smallest>digit){
                smallest=digit;
            }
            n=n/10;
        }

        System.out.println("The smalles digit is: "+smallest);
        sc.close();
    }
}
*/


public class loop25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=sc.nextInt();

        int largest=Integer.MIN_VALUE;

        while(n>0){
            int digit=n%10;
            if(largest>digit){
                largest=digit;
            }
            n=n/10;
        }

        System.out.println("The largest digit is: "+largest);
        sc.close();
    }
}