package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map1 {
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

        Set entries=map.entrySet();
        System.out.println("Set: "+entries);

        for(Map.Entry<String,Integer> e:map.entrySet()){
            String key=e.getKey();
            Integer value=e.getValue();

            if(value>40000){
                System.out.println("Key: "+key+"  ->  value: "+value);
            }
        }
    }
}
