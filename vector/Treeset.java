package vector;

import java.util.TreeSet;

/*
TreeSet:
    It is an implementation class of Set interface.
    It is present inside java.util package.
    It was introduced in jdk 1.2
    It follows sorted order (ascending order by default).
    It doesnot follow insertion order.
    It doesnot allow duplicate elements.
    It doesnot allow null elements.
    It can store only same type of objects.
    It is used when sorted data with uniqueness is required.
*/
public class Treeset {
    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        // Duplicate element (ignored)
        set.add(30);

        // Display TreeSet
        System.out.println("TreeSet elements (Sorted): " + set);
    }
}
