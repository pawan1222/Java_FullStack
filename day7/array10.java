package day7;
// find the average of largest and smallest elements in the array
public class array10 {
    public static void main(String[] args) {
        int[] arr={1,3,2,2,4,1,2,1};

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        double avg=(largest+smallest)/(double)2;
        System.out.println(avg);
    }
}
