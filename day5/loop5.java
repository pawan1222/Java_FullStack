package day5;

/*
when we use while loop  ->  when we don't know the number of iteration
when we use do while loop  ->  when we don't know the number of iteration and we want to execute the loop at least once
when we use for loop  ->  when number of iteration is known

WAJP to print numbers from the range

1111 to 1121
1234 to 1223
-1111 to -1123
-1234 to -1223
using for loop
*/





public class loop5 {
    public static void main(String[] args) {
        for(int i=1111;i<=1121;i++){
            System.out.println(i);
        }

        for(int i=1234;i>=1223;i--){
            System.out.println(i);
        }

        for(int i=-1111;i>=-1121;i--){
            System.out.println(i);
        }

        for(int i=-1234;i<=-1223;i++){
            System.out.println(i);
        }
        
    }
}
