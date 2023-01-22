package datastructure;

// Queue data structure
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Poll - consume
        System.out.println("Poll: " + queue.poll());

        // Print the queue
        System.out.println("Queue: " + queue);

        // Peek
        System.out.println("Peek: " + queue.peek());

        // Print the queue
        System.out.println("Queue: " + queue);
    }
}
