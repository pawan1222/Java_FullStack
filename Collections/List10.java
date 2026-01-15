package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
WAJP to remove object from list one by one
*/
public class List10 {
    public static void main(String[] args) {
        int[] arr = {10,21,23,56,78,96,25,71};
        List<Integer> list = new ArrayList<>();

        for(int i:arr){
            list.add(i);
        }
        System.out.println(list);

        Iterator <Integer> itr = list.iterator();

        while(itr.hasNext()){
            itr.next();
            itr.remove();
            System.out.println(list);
        }
        
    }
}
