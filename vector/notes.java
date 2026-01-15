package vector;
/*
Vector:
    It is a dynamic array that can grow or shrink in size as needed.
    It is presented in java.util package.
    It is known as legacy class because it is available since JDK 1.0v.
    Objects of vectors are stored in contiguous memory locations. 
    It is synchronized i.e. thread-safe.
    It allows duplicate elements.
    It allows random access to elements as it stores the elements on the basis of index.
    It is slower than ArrayList because of synchronization overhead.
    It grows its size by 100% when its capacity is full.
    It is used in multi-threaded environment where thread-safety is required.

	difference between ArrayList and Vector:

	1. Synchronization: Vector is synchronized, whereas ArrayList is not.
	2. Growth Rate: Vector doubles its size when it reaches capacity, while ArrayList increases its size by 50%.
	3. Performance: Due to synchronization, Vector is generally slower than ArrayList.
	4. Legacy: Vector is a legacy class from JDK 1.0, while ArrayList was introduced in JDK 1.2 as part of the Collections Framework.


	Stack:
	Stack is a subclass of Vector.
	It is a implementation class List interface.
	It is present in java.util package.
	It is present since JDK 1.0v.
	hence it is a legacy class.
	It follows LIFO(Last In First Out) principle.
	It is used to perform stack operation.

	To perform stack operation we have the following methods:
		push(): It is used to add an element at the top of the stack.
				return type: object
		pop(): It is used to remove and return the top element of the stack.
				return type: object
		peek(): It is used to return the top element of the stack without removing it.
				return type: object
		isEmpty(): It is used to check if the stack is empty or not.
				return type: boolean
		size(): It is used to return the number of elements in the stack.
				return type: int
		search(): It is used to search for an element in the stack and returns its position from the top of the stack.

	
*/


import java.util.Vector;
import java.util.*;

public class notes {
	public static void main(String[] args) {
		List<String> v =  new Vector<String>();
		v.add("Suraj");
		v.add("mridul");
		v.add("kabir");
		v.add("girish");
		System.out.println(v);
		System.out.println(v.size());
		
		for(int i = 0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("-----");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
