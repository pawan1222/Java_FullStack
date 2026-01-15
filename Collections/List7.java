package Collections;

import java.util.*;
import java.util.Arrays;

/*
WAJP to convert array into List;
*/
public class List7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        List <Integer>list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        System.out.println(list);

        List <Integer>list2 = Arrays.asList(1,2,3,4,5);
        System.out.println(list2);

        // list2.add(0,10);  //UnsupportedOperationException
        // list2.remove(2); //UnsupportedOperationException
        System.out.println(list2);

    }
}
