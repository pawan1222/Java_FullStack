package day5;

// WAJP to print perfect numbers between 1 to 100


public class loop14 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }

            if(sum==i){
                System.out.print(i+" ");
            }
        }

    }
}
