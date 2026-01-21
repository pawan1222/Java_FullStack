package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Stream:
    Stream is a java 8 feature used to process collections data in a functional way without using loops.
    Stream does not store data, it only process data.
    It works on collection data
    Stream processes data one by one
    Stream does not modify the original data source

    Basic Stream flow: Collection -> Stream -> Intermediate operations -> result 
    eg: List -> Stream -> filter() -> forEach()

    Basic methods of Stream:
        1. stream(): to convert collection to stream so we can process data in a functional way
        2. filter(): to filter data based on condition
        3. map(): to transform each element in the stream into another form
        4. forEach(): perform an action on each element of the stream
        5. collect(): tconvert stream back to collection
        6. sorted(): to sort stream element using natural sorting order
        7. sorted(Comparator): to sort data based on custom sorting logic

*/

class Student {
    int id;
    String name;
    double marks;
    
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}


public class stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 7, 3, 15);

        System.out.println("Original numbers: " + numbers);
        System.out.println(" to print Numbers one by one:");
        numbers.stream().forEach(System.out::println);

        System.out.println("\n to print Even Numbers:");
        numbers.stream().filter(n-> n%2==0).forEach(System.out::println);

        System.out.println("\n to print Odd Numbers with extra value 3:");
        numbers.stream().filter(n-> n%2!=0).map(n-> n+3).forEach(System.out::println);

        System.out.println("\n find even numbers and stored in a list:");
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> names = Arrays.asList("Kabir","Devansh","Girish","Nitish","Murali");
        System.out.println("\n print name end with 'sh':");
        names.stream().filter(name-> name.endsWith("sh")).forEach(System.out::println);


        List<Student> st=List.of(
            new Student(3,"Murali",75.5),
            new Student(4,"Aditya",85.5),
            new Student(1,"Vishnu",80.5),
            new Student(2,"Pramod",90.5)
        );
        System.out.println("\n print only those students who got marks more than 80:");
        st.stream().filter(s->s.marks>80).forEach(System.out::println);
    }
}
