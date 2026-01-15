package day6;

public class method3 {
    public static void main(String[] args) {
        find_max(4,5,6);
        check_prime(5);
        find_min(2,3,4);
        fibonacci(5);

    }

    public static void find_max(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    public static void check_prime(int a){
        boolean isprime=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("yes it is prime no");
        }
    }
    public static void find_min(int a,int b,int c){
        if(a<b && a<c){
            System.out.println(a);
        }else if(b<a && b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    public static void fibonacci(int n){
        int a=0;
        int b=1;
        System.out.println(0);
        System.out.println(1);
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
