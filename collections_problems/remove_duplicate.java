package collections_problems;

import java.util.*;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,5,1,6,7,8,7};
        Set<Integer>unique=new HashSet<>();

        for(int num:arr){
            unique.add(num);
        }   

        System.out.println(unique);
    }
}
