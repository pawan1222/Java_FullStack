package vector;

import java.util.PriorityQueue;
import java.util.Queue;

/*
It is an implementation class of Queue interface.
It is present since jdk 1.5v.
It is present inside java.util package.
It is based on priority heap data structure. 
It follows min heap property.
It does not allow null values.
It allows duplicate elements.
It does not maintain insertion order.
The elements of the priority queue are ordered according to their natural ordering,
or by a Comparator provided at queue construction time.

To perform priority queue operation we have the following methods:
    1. add(): It is used to insert the specified element into this priority queue.
                return type: boolean
    2. offer(): It is used to insert the specified element into this priority queue.
                return type: boolean
    3. remove(): It is used to retrieve and remove the head of this queue.
                return type: object
    4. poll(): It is used to retrieve and remove the head of this queue, or returns null if this queue is empty.
                return type: object
    5. element(): It is used to retrieve, but does not remove, the head of this queue.
                return type: object
    6. peek(): It is used to retrieve, but does not remove, the head of this queue, or returns null if this queue is empty.
                return type: object



*/
public class priorityQueue {
    public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(10);
		pq.offer(15);
		pq.offer(26);
		pq.offer(7);
		pq.offer(13);
		pq.offer(10);
		pq.offer(14);
//		pq.offer(null); NullPointerException
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}
}

/* 
Output : 
[7, 10, 10, 15, 13, 26, 14]
7
7
7
[10, 13, 10, 15, 14, 26]
10
[10, 13, 26, 15, 14]
[13, 14, 26, 15]
[14, 15, 26]

*/
