package Collections;

import java.util.List;
import java.util.ArrayList;

/*
WAJP to print all the elements of list one by one using get method;
*/
public class List3 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("lpu");
        list.add("punjab");
        list.add("India");
        list.add("Asia");

        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // System.out.println(list.get(3));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
