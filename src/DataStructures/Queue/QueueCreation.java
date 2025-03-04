package DataStructures.Queue;
/*
Queue data structure is known as first in first out because the element we are pushing in will come out first.
It is internally implemented using LinkedList dataStructure.
It takes O(1) complexity for insertion and deletion operations.
Applications: Call Centre, Task Management, Job Scheduling.
Methods:
- offer(E e) : Adds an element to the queue.
- poll() : Removes and returns the front element. Returns null if the queue is empty.
- peek() : Returns the front element without removing it. Returns null if the queue is empty.
- isEmpty() : Checks if the queue is empty.
 */

import java.util.*;

public class QueueCreation {
    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<String> q = new LinkedList<>();

        // Adding elements to the queue
        q.offer("Hello");
        q.offer("World"); // Adds the element at the end of the queue

        // Removing and displaying the front element
        System.out.println("Removed Element: " + q.poll());

        // Checking and displaying the front element
        System.out.println("Front Element: " + q.peek());

        // Handling the case when the queue becomes empty
        q.poll(); // Removes "World"
        if (q.isEmpty()) {
            System.out.println("Queue is now empty!");
        }
    }
}
