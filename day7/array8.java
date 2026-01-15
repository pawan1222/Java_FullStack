package day7;
// Two sum return index of both no 
public class array8 {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,8,8,11,13};
        int k=10;

        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]+arr[right] < k){
                left++;
            }else if(arr[left]+arr[right] > k){
                right--;
            }else if(arr[left]+arr[right]==k){
                System.out.println(left+" "+right);
                break;
            }
        }
    }
}
