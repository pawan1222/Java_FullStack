package day7;


// WAJP to print sum of all number from 1 to 5 without any loop
public class recur3 {
    public static void main(String[] args) {

        System.out.println(solve(0));

    }

    public static int solve(int count){
        if(count>5){
            return 0;
        }
        return count+solve(count+1);
    }
}
