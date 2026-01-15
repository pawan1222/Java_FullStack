package Collections;
/*
Write a Java program that performs the following using an ArrayList of integers:
- Add the following numbers to the list: 10, 5, 20, 15, 25.
- Insert the number 12 at index 2.
- Print all elements of the list.
- Check if the number 15 exists in the list and print an appropriate message.
- Sort the list in ascending order.
- Remove the number 5 from the list.
- Print the final list and its size.
*/

import java.util.*;
public class List5 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        numbers.add(2,12);
        if(numbers.contains(15)){
            System.out.println("15 is presnt in the list");
        }else{
            System.out.println("Not present in the list");
        }

        Collections.sort(numbers);
        numbers.remove(Integer.valueOf(5));
        
        System.out.println(numbers);
        System.out.println("Size : "+numbers.size());
    }
}
