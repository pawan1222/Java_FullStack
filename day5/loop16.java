package day5;

// WAJP to print factorial of numbers from the range 1 to 10

public class loop16 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            int fact=1; 
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            System.out.println(fact+" ");
        }
    }
}
