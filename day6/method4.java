package day6;
// WAJP to create a method to check the no is a part of fibonnaci series or not
public class method4 {
    public static void main(String[] args) {
        solve(7);
    }

    public static void solve(int n){
        boolean istrue=false;

        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            if(n==c){
                istrue=true;
                break;
            }
            a=b;
            b=c;
        }
        if(istrue){
            System.out.println("Yes it is in the series");
        }else{
            System.out.println("is not present");
        }
    }
}
