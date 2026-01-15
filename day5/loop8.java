package day5;

/*
WAJP tp print even no form 1 to 20
WAJP tp print no which is divisible form 7 in range of 100 to 50
WAJP to print sum of all no from 1 to 10
WAJP to print product of all no from 1 to 10
*/


public class loop8 {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }



        for(int i=100;i>=50;i--){
            if(i%7==0){
                System.out.println(i+" ");
            }
        }

        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);


        int product=1;
        for(int i=1;i<=10;i++){
            product*=i;
        }
        System.out.println(product);
    }
}
