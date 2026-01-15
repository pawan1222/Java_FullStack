package day7;

public class array13 {
    public static void main(String[] args) {
        int[] arr={123,87348,9389};

        for(int i=0;i<arr.length;i++){
            int rev=0;
            while(arr[i]>0){
                int digit=arr[i]%10;
                rev=rev*10+digit;

                arr[i]/=10;
            }
            System.out.println(rev+" ");
        }
    }
}
