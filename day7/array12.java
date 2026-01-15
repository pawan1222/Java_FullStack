package day7;
// find the max occurance of k in the given array elements
public class array12 {
    public static void main(String[] args) {
        int[] arr={37,222,2542222,12121212};
        int max_occ=0;
        for(int i=0;i<arr.length;i++){
            int occ=0;
            while(arr[i]>0){
                int digit=arr[i]%10;
                if(digit==2){
                    occ++;
                }
                arr[i]/=10;
            }
            if(max_occ<occ){
                max_occ=occ;
            }
        }
        System.out.println(max_occ);
    }
}
