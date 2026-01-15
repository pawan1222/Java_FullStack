package day5;

// WAJP to check the given no is strong no or not


import java.util.Scanner;

public class loop30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();

        int sum=0;
        int temp=n;

        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            temp=temp/10;
        }

        if(sum==n){
            System.out.println("Yes it is strong no");
        }else{
            System.out.println("NO it  is not strong no");
        }
        sc.close();
    }
}


// WAJP to print strong no the given range

