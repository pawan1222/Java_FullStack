package vector;

import java.util.*;
import java.util.Set;

/*
WAJP to remove duplicate from the list.
and print only unique elements.
*/
public class set1 {
    public static void main(String[] args) {
        List<Integer>al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(10);
        al.add(20);
        al.add(50);
        System.out.println("Original list: "+al);

        Set<Integer>hs=new HashSet<>(al);
        al.clear();

        al.addAll(hs);
        System.out.println("List after removing duplicates: "+al);
    }
}
