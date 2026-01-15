package day5;

// WAJP to check the given no is palindrome no or not
/* 
import java.util.Scanner;

public class loop31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();

        int temp=n;
        int revno=0;
        while(temp>0){
            int digit=temp%10;
            revno=revno*10+digit;
            temp=temp/10;
        }

        if(revno==n){
            System.out.println("Yes it is palindrome no.");
        }
        else{
            System.out.println("No it is not.");
        }
        sc.close();
    }
}
*/

// WAJP to print all palindrome no. from the range 100 to 200


public class loop31 {
    public static void main(String[] args) {
       
        for(int i=100;i<=200;i++){
            int temp=i;
            int revno=0;
            while(temp>0){
                int digit=temp%10;
                revno=revno*10+digit;
                temp=temp/10;
            }

            if(revno==i){
                System.out.println(i);
            }
        }
    }
}