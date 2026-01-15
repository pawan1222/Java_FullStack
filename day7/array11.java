package day7;
// WAJP to print leader in the given array 
// leader->it is the element is greater than all other following elements(right side elements)
public class array11 {
    public static void main(String[] args) {
        int[] arr={8,7,4,3,5,2};


        for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    count++;
                }else if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(count==arr.length-i-2){
                System.out.println(arr[i]);
            }
        }
    }
}
