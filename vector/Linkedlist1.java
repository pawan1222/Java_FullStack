package vector;
/*
WAJP to iterate all the objects of linkedlist in forward as well as backward direction;
*/

import java.util.*;
public class Linkedlist1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        List<Integer> ll=new LinkedList<Integer>();

        for(int i=0;i<arr.length;i++){
            ll.add(arr[i]);
        }

        ListIterator <Integer>ltr = ll.listIterator();

        

    }
}
