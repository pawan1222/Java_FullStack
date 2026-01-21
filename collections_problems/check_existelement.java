package collections_problems;

import java.util.*;

public class check_existelement {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int element=5;

        Set<Integer> set=new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        if(set.contains(element)){
            System.out.println("Yes it is present");
        }else{
            System.out.println("Not present");
        }
    }
}
