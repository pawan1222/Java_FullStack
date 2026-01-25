package Map;

import java.util.*;

/*
Map: 
    It is a interface, present inside java.util package.
    It is used to store data in key value pair.
    one key value pair is known as one entry.
    key must be unique.
    values can be duplicate.

    Map doesnot comes under collections because in collection we store only object but in map
    we store objects in the form of key value pair.

    Map interface has 3 implementing classes such as 
        1.hashMap
        2.LinkedHashMap
        3.TreeMap

    HashMap: 
	It is an implementation class of Map interface
	It is present inside java.util package
	It was introduced in JDK 1.2
	It does not follow insertion order
	It does not follow sorting order
	It does not allow duplicate keys
	It allows duplicate values
	It allows only one null key
	It allows multiple null values
	It is internally implemented using HashTable (Hashing mechanism)
	It provides fast performance for put, remove, and get operations
	It is not synchronized
	It is used when fast access is required and order is not important

LinkedHashMap
	It is an implementation class of Map interface
	It is present inside java.util package
	It was introduced in JDK 1.4
	It follows insertion order
	It does not follow sorting order
	It does not allow duplicate keys
	It allows duplicate values
	It allows only one null key
	It allows multiple null values
	It is internally implemented using HashTable + Doubly Linked List
	It provides slightly slower performance than HashMap due to order maintenance
	It is not synchronized
	It is used when uniqueness of keys + insertion order both are required

TreeMap
	It is an implementation class of NavigableMap interface
	It is present inside java.util package
	It was introduced in JDK 1.
	It follows sorted order of keys (ascending by default)
	It does not follow insertion order
	It does not allow duplicate keys
	It allows duplicate values
	It does not allow null keys
	It allows multiple null values
	It stores keys in sorted structure
	It is used when sorted key-value pairs are required

    put(Object key, Object value):
        It is used to add entry inside map.
        return type is Object.
        It will return previous value of key, if we are adding key first time so it will return null.
        If we try to store duplicate key it will override previous value.

    remove(Object key):
        It is used to remove the entry using key.
        return type is Object.
        It will return value of specific key.
        If we dont have that specific key then it will return null.

    containsKey(Object key):
        It is used to check whether the given key is present or not.
        return type is boolean.

    containsValue(Object value):
        It is used to check whether the given value is present or not.
        return type is boolean.

    get(Object key):
        It is used to return value present at specific key.
        return type is Object.

    entrySet():
        It is used to convert all the entries of map into set interface.
        return type is Set interface.

    KeySet():
        It is used to get all the keys of map in set formate.
        return type is set interface.

    Values();
        It is used to get all the values of map in collection formate.
        return type is collection interface.


*/
public class map {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        System.out.println(map.put(1,"kabir")); //null
        System.out.println(map.put(12.2,12.5)); //null
        System.out.println(map.put(1,"Mohit")); //Kabir
        System.out.println(map);  //{1=Mohit, 12.2=12.5}

        map.put(null, null);
        map.put(true,10);
        map.put('a','a');
        map.put("LPU",100);
        System.out.println(map);

        System.out.println(map.remove(true));
        System.out.println(map.remove("Jalandhar"));

        System.out.println(map.containsKey(true)); // false
        System.out.println(map.containsKey("LPU")); //true

        System.out.println(map.containsValue("XYZ")); //false
        System.out.println(map.containsValue(100)); //true

        System.out.println(map.get(10));

        Set entries=map.entrySet();
        System.out.println("Set: "+entries);

        for(Object obj:entries){
            System.out.println(obj);
        }

        

        Set keys=map.keySet();
        System.out.println("Keys: "+keys);

        Iterator itr=keys.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

        Collection values=map.values();
        System.out.println("Keys: "+values);

        Iterator itr2=values.iterator();
        while(itr2.hasNext()){
            System.out.print(itr2.next());
        }
    }
}
