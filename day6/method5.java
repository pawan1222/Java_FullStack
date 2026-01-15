package day6;

public class method5 {
    public static void main(String[] args) {
        int n=2538;
        reverse_no(n);
        ispalindrome(n);
        // isStrong_no(n);
        count_prime_digits(n);
    }
        public static void reverse_no(int n){
            int revsere=0;
            while(n>0){
                int digit=n%10;
                revsere=revsere*10+digit;
                n=n/10;
            }
            System.out.println("reverse no is: "+revsere);
        }
        public static void ispalindrome(int n){
            int temp=n;
            int revsere=0;
            while(n>0){
                int digit=n%10;
                revsere=revsere*10+digit;
                n=n/10;
            }
            System.out.println(revsere==temp);
        }

        public static void isStrong_no(int n){

        }

        public static void count_prime_digits(int n){
            int count=0;
            while(n>0){
                boolean isprime=true;
                int digit=n%10;
                for(int i=2;i<digit;i++){
                    if(digit%i==0){
                        isprime=false;
                        break;
                    }
                }
                if(isprime){
                    count++;
                }
                n=n/10;
            }
            System.out.println("count of prime digit: "+count);
        }
}
