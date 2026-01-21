package functional_programming;
/*
forEach() :
The forEach() method in Java is used to iterate over elements in a collection, such as a List, Set, or Map.
It takes a lambda expression or a method reference as an argument and applies it to each element in the collection.

Syntax:
collection.forEach(action);
Example:
   list.forEach(element -> System.out.println(element));
       
*/
import java.util.List;
public class forEach1 {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using forEach() with a lambda expression to print each element
        list.forEach(element -> System.out.println(element));
    }
}
