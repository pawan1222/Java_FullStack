package day7;


// WAJP to print no 1 to 1000 without loop
public class recur1 {
    public static void main(String[] args) {
        print(1);
        
    }
    public static void print(int n){
        if(n>1000){
            return;
        }
        System.out.print(n+" ");
        // print(n+1);
        print(++n);
    }
}
