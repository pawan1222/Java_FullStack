
package day1;
/* 
public class operators {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        if((a=3)==b){
            System.out.println(a);
        }
        else{
            System.out.println(a+b);
        }
    }

}



public class operators {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=a||b && !a;
        System.out.println(c);
    }
}


*/

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number"); 
        int num=sc.nextInt();
        System.out.println("Enter the power");
        int power=sc.nextInt();
        
        int res=(num*power) % 12;
        if(res==0){
            res=12;
        }
            System.out.println(res);
        sc.close();
    }
}
