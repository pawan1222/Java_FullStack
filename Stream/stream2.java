package Stream;
/*
1. Write a Java Stream one-liner to sort Students objects by id in ascending order and print them.
2. Write a Java Stream one-liner to sort Students objects by id in descending order and print them.
3. Write a Java Stream one-liner to sort Students objects based on name and display the result.
4. Write a Java Stream one-liner to sort Students objects by marks and print them.
5. ⁠Write a Java Stream one-liner to add 5 grace marks to each student and print the updated marks.

*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students{
	int id;
	String name;
	double marks;
	public Students(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
public class stream2 {
	public static void main(String[] args) {
		
		List<Students> st = new ArrayList<Students>();
		st.add(new Students(3, "Murali", 75.5));
		st.add(new Students(4, "Aditya", 85.5));
		st.add(new Students(1, "Vishnu", 80.5));
		st.add(new Students(2, "Pramod", 90.5));
		st.add(new Students(2, "Suraj", 55.5));

        System.out.println("Original List: "+ st);

        System.out.println("\n1. Sort by id in ascending order:");
        st.stream().sorted(Comparator.comparingInt(s -> s.id)).forEach(System.out::println);

        System.out.println("\n2. Sort by id in descending order:");
        st.stream().sorted(Comparator.comparingInt((Students s) -> s.id).reversed()).forEach(System.out::println);

        System.out.println("\n3. Sort by name:");
        st.stream().sorted(Comparator.comparing(s -> s.name)).forEach(System.out::println);

        System.out.println("\n4. Sort by marks:");
        st.stream().sorted(Comparator.comparingDouble(s -> s.marks)).forEach(System.out::println);

        System.out.println("\n5. Add 5 grace marks to each student and print updated marks:");
        st.stream().map(s -> new Students(s.id, s.name, s.marks + 5)).forEach(System.out::println);
	}
}