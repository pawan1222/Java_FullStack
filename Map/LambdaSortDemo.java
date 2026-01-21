package Map;
import java.util.*;
/*
Comparable:
    It is an interface present in java.lang package.
    It was introduced in JDK 1.2 version.
    It is used to define natural sorting order of objects of user-defined class.
    It provides only one method -> compareTo(Object obj)
    Sorting logic is written inside compareTo() method.
    It allows one sorting sequence only.
    It is used to default sorting logic is required
    It is mainly used  with Collections.sort() and TreeSet/TreeMap
    It modifies the original class
    Example: String, Integer, Float already implements Comparable interface.
*/


/* 
public class comparableclass implements Comparable<comparableclass> {
    int id;
    String name;

    comparableclass(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(comparableclass obj) {
        //return this.id - obj.id; // Ascending order sorting based on id
        return obj.id - this.id; // Descending order sorting based on id
    }

    public static void main(String[] args) {
        List<comparableclass> list = new ArrayList<>();
        list.add(new comparableclass(101, "Aman"));
        list.add(new comparableclass(105, "Ankit"));
        list.add(new comparableclass(103, "Pawan"));
        list.add(new comparableclass(102, "Anish"));

        System.out.println("Before Sorting:");
        for (comparableclass c : list) {
            System.out.println(c.id + " " + c.name);
        }

        Collections.sort(list);

        System.out.println("\nAfter Sorting:");
        for (comparableclass c : list) {
            System.out.println(c.id + " " + c.name);
        }
    }
}


*/

// import java.util.*;

public class LambdaSortDemo {

    int id;
    String name;

    LambdaSortDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        List<LambdaSortDemo> list = new ArrayList<>();
        list.add(new LambdaSortDemo(101, "Aman"));
        list.add(new LambdaSortDemo(105, "Ankit"));
        list.add(new LambdaSortDemo(103, "Pawan"));
        list.add(new LambdaSortDemo(102, "Anish"));

        System.out.println("Before Sorting:");
        for (LambdaSortDemo c : list) {
            System.out.println(c.id + " " + c.name);
        }

       
        Collections.sort(list, (a, b) -> b.id - a.id);

        System.out.println("\nAfter Sorting (Descending by id):");
        for (LambdaSortDemo c : list) {
            System.out.println(c.id + " " + c.name);
        }
    }
}
