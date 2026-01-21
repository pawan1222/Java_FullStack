package collections_problems;

import java.util.*;
public class count_uniqueelement {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,2,3,6,7,8,9,9};

        Set<Integer> unique=new HashSet<>();

        for(int num:arr){
            unique.add(num);
        }
        System.out.println("No of unique element is: "+unique.size());
        System.out.println(unique);
    }
}
