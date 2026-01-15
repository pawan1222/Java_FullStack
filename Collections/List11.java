package Collections;
import java.util.*;
public class List11 {
    public static void main(String[] args) {
        String[] a={"suraj","mridul","Kabir","girish"};

         List<String> list = new ArrayList<>();

        for(String i:a){
            list.add(i);
        }

        System.out.println(list);
        ListIterator <String>ltr = list.listIterator();
        // System.out.println(ltr.hasPrevious());  //false
        // System.out.println(ltr.previous());  // NosuchElementException
        System.out.println("===move forward===");
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }
        
        System.out.println("===move backward===");
        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }
    }
}
