package datastructure;

import java.util.PriorityQueue;

//The PriorityQueue class in Java is a priority queue implementation that is based on a priority heap.
// A priority queue is a queue data structure that orders its elements based on a priority,
// with the element with the highest priority being dequeued first.
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue with a custom comparator
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        // Add elements to the queue
        queue.add(3);
        queue.add(5);
        queue.add(1);
        queue.add(2);
        queue.add(4);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove the highest priority element from the queue
        int removed = queue.poll();
        System.out.println("Removed element: " + removed);

        // Print the queue
        System.out.println("Queue: " + queue);
    }
}
