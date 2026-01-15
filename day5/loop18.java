package day5;

// WAJP to print factorial of all prime numbers from the range 14 to 5

public class loop18 {
    public static void main(String[] args) {
            
        for(int i=5;i<=14;i++){
            boolean flag=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                int fact=1;
                for(int k=1;k<=i;k++){
                    fact*=k;
                }
                System.out.println("fact of "+i+"is "+fact);
            }
        }
    }
}

