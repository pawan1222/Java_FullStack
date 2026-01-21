package collections_problems;
import java.util.*;
public class common_element {
    public static void main(String[] args) {
        int[] arr1={1,2,3,8,9,6};
        int[] arr2={1,2,3,5,6,0};

        Set<Integer> set1=new HashSet<>();
        Set<Integer> common=new HashSet<>();

        for(int num:arr1){
            set1.add(num);
        }
        for(int num:arr2){
            if(set1.contains(num)){
                common.add(num);
            }
        }
        System.out.println("Common elements are: "+common);
    }
}
