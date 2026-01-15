package day3;
import java.util.Scanner;
//  WAP to give info about fruit using switch case

// 1.we cant use long , float , double and boolean in switch case
// 2.we cant use relational operators in switch case
// 3.we cant use logical operators in switch case
// 4.we cant use range in switch case
// 5.we cant use expressions in switch case
// 6.we cant use variable in switch case
// 7.we cant use null in switch case
// 8.we cant use more than one value in case in switch case
// 9.we cant use duplicate case values in switch case
// 10. default is not mandatory in switch case
// 11. break is not mandatory in switch case


public class prac3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("take input: ");
        String fruits=sc.next();
        switch(fruits){
            case "Apple":
                System.out.println("Apples are rich in fiber and vitamin c");
                break;
            case "banana":
                System.out.println("Banana are great source of potassium");
                break;
            case "mango":
                System.out.println("Mangos are the king of fruits");
                break;
            default:
                System.out.println("sorry i dont have info about this fruit");
        }
        sc.close();
    }
}
