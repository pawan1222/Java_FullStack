package day7;
// count element of unsorted array which is equals to average of the array
public class array9 {
    public static void main(String[] args) {
        int[] arr={1,3,2,2,4,1,2,1};

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==avg){
                count++;
            }
        }
        System.out.println(count);
    }
}
