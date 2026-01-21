package collections_problems;

import java.util.*;

public class union_of2set {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={1,2,3,45,78,11,23};

        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        Set<Integer>union=new HashSet<>();

        for(int num:arr1){
            set1.add(num);
        }
        for(int num:arr2){
            set2.add(num);
        }

        for(Integer element:set1){
            union.add(element);
        }
        for(Integer element:set2){
            union.add(element);
        }

        System.out.println("Union of two set is: "+union);

    }
}
