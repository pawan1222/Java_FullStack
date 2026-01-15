package day5;


import java.util.Scanner;
public class loop9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            

            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if(i%3!=0 && i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
