package day7;
// WAJP to print odd no from the range 500 to 50 without any loop
public class recur2 {
    public static void main(String[] args) {
        solve(500);
    }

    public static void solve(int n){
        if(n>=50 && n<=500){
            if(n%2!=0){
                System.out.println(n+" ");
            }
            solve(--n);
        }
        
        // if(n<50){
        //     return;
        // }
        // if(n%2!=0){
        //     System.out.println(n+" ");
        // }
        // solve(n-1);
    }
}
