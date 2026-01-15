package day5;

// WAJP to print factorial of all odd numbers from the range 1 to 10

public class loop17 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2!=0){
            int fact=1; 
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            System.out.println(fact+" ");
            }
        }
    }
}

