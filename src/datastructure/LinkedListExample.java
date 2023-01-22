package datastructure;

// Linked list data structure
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the linked list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");

        // Print the linked list
        System.out.println("Linked list: " + list);

        System.out.println("Capacity: " + list.size());

        // Remove an element from the linked list
        list.remove("cherry");

        System.out.println("Capacity after removal: " + list.size());

        // Print the linked list
        System.out.println("Linked list: " + list);

        // Get first
        System.out.println("First: " + list.getFirst());

        for (String s : list) {
            System.out.println(s);
        }
    }
}