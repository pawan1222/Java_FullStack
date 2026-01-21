package vector;
/*
Problem Statement

You are developing a Train Compartment Management System using Java Collections.
Each compartment is identified by a compartment number (Integer).

Tasks to Perform
	Create a LinkedList<Integer> to store compartment numbers.
	Add compartments in the following order: 101, 102, 103, 104, 105, 106

Perform the following operations step by step:
Operations
	Insert a VIP compartment (999): Immediately after compartment 102
	Remove all even-numbered compartments (Use Iterator only)
	Reverse the remaining compartments without using Collections.reverse()
	Check whether compartment 105 exists:
		If present → print its index
		If not present → print "Compartment not found"
*/

import java.util.*;
import java.util.Iterator;


public class Linkedlist2 {
    public static void main(String[] args) {

        // Step 1: Create LinkedList
        LinkedList<Integer> compartments = new LinkedList<>();
        compartments.add(101);
        compartments.add(102);
        compartments.add(103);
        compartments.add(104);
        compartments.add(105);
        compartments.add(106);

        System.out.println("Initial: " + compartments);

        int index = compartments.indexOf(102);
        compartments.add(index + 1, 999);

        Iterator<Integer> itr = compartments.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println("After removing evens: " + compartments);


        LinkedList<Integer> reversed = new LinkedList<>();
        for (Integer i : compartments) {
            reversed.addFirst(i);
        }
        compartments = reversed;

        System.out.println("Reversed: " + compartments);

        int idx = compartments.indexOf(105);
        if (idx != -1) {
            System.out.println("Compartment 105 found at index: " + idx);
        } else {
            System.out.println("Compartment not found");
        }
    }
}
