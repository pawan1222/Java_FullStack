package Collections;

import java.util.*;

/*
WAJP to remove all odd numbers from an ArrayList containing integers.
*/
public class List9 {
    public static void main(String[] args) {
        int[] arr = {10,21,23,56,78,96,25,71};
        List<Integer> list = new ArrayList<>();

        for(int i:arr){
            list.add(i);
        }
        System.out.println(list);

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2!=0){
        //         list.remove(Integer.valueOf(arr[i]));
        //     }
        // }

        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 != 0){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
