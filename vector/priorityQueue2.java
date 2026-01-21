package vector;
/*
Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
Create a Task class with name and priority.
Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
Add at least 5 tasks with different priorities.
Print the tasks in the order they are executed.
In a priority queue, elements are ordered based on priority (not insertion order). By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.
*/

import java.util.*;
public class priorityQueue2 {
    public static void main(String[] args) {
        Queue<Integer>pq=new PriorityQueue<>();

        pq.offer(2);
        pq.offer(3);
        pq.offer(85);
        pq.offer(23);
        pq.offer(20);

        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
