package Map;

import java.util.*;

/*
WAJP to manage employee salary details using map.
	1. add atleast 6 employee records 
	2. print only those employees whose salary  is greater than 50000
*/
public class map2 {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("Aman",70000);
        map.put("Ankit",30000);
        map.put("Pawan",60000);
        map.put("Anish",120000);
        map.put("Aditya",80000);
        map.put("Mridul",20000);
        map.put("Bikash",50000);
        map.put("Sachin",40000);

        Collection values=map.values();

        Iterator itr=values.iterator();

        while(itr.hasNext()){
            Integer salary=(Integer) itr.next();
            if(salary > 50000){
                System.out.println(itr.next());
            }
        }
    }
}
