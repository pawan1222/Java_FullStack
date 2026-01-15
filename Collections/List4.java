package Collections;
/*
Write a Java program that performs the following operations on an ArrayList of Strings:
- Create an ArrayList named cities.
- Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
- Insert the city "Bangalore" at index 2.
- Display all the cities in the list.
- Check whether the city "Mumbai" exists in the list and print a message:
	If found, print: "Mumbai is present in the list."
	Otherwise, print: "Mumbai is not present in the list."
- Sort the list of cities in alphabetical order and display the sorted list.
- Clear the list and print the final size of the ArrayList.
*/

import java.util.*;
public class List4 {
    public static void main(String[] args) {
        List<String> city = new ArrayList<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Chennai");
        city.add("Kolkata");

        city.add(2,"Banglore");

        if(city.contains("Mumbai")){
            System.out.println("Mumbai is present in the list");
        }else{
            System.out.println("Mumbai is not present");
        }

        Collections.sort(city);
        System.out.println("Sorted list: "+ city);

        city.reversed();
        System.out.println("Sorted list: "+ city);

        city.clear();
        System.out.println("Size of list after clear: "+ city.size());

    }
}
