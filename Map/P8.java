package Map;
/*
Comparator:
    It is an interface present in java.util package.
    It was introduced in JDK 1.2 version.
    It is used to define custom sorting order of objects of user-defined class.
    It provides two methods 
        -> compare(Object obj1, Object obj2)
        -> equals(Object obj)
    Sorting logic is written in separate class.
    It allows multiple sorting sequences.
    It is used when class source code cannot be modified.
    It doesnot modify the original class.
    It is mainly used with Collections.sort() and TreeSet/TreeMap
    Useful for sorting based on multiple fields.
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparatorclass implements Comparable<comparatorclass>{
	int id;
	String name;
	double marks;
	public comparatorclass(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(comparatorclass s) {
		return this.id - s.id;
	}
}

class SortByNames implements Comparator<comparatorclass>{

	@Override
	public int compare(comparatorclass s1, comparatorclass s2) {
		return s1.name.compareTo(s2.name);
	}
}

class SortByMarks implements Comparator<comparatorclass>{

	@Override
	public int compare(comparatorclass s1, comparatorclass s2) {
		return Double.compare(s1.marks, s2.marks);
	}
	
}
public class P8 {
	public static void main(String[] args) {
		
		List<comparatorclass> st = new ArrayList<comparatorclass>();
		st.add(new comparatorclass(3, "Murali", 75.5));
		st.add(new comparatorclass(4, "Aditya", 85.5));
		st.add(new comparatorclass(1, "Vishnu", 80.5));
		st.add(new comparatorclass(2, "Pramod", 90.5));
		st.add(new comparatorclass(2, "Suraj", 55.5));
		System.out.println(st);
		Collections.sort(st);
		System.out.println("\n--Sorted by id--");
		for (comparatorclass s : st) {
			System.out.println(s);
		}
		System.out.println("\n--Sorted by name--");
		Collections.sort(st,new SortByNames());
		for (comparatorclass s : st) {
			System.out.println(s);
		}
		
		System.out.println("\n--Sorted by marks--");
		Collections.sort(st, new SortByMarks());
		for (comparatorclass s : st) {
			System.out.println(s);
		}
	}
}