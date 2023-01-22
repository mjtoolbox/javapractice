package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//In Java, you can use a comparator to define a custom ordering for a collection of objects.
// A comparator is an object that implements the Comparator interface,
// which defines a single method called compare() that takes two objects
// as arguments and returns an integer indicating their relative order.
public class CustomComparatorExample {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);

        // Print the list
        System.out.println("List: " + list);

        // Sort the list using a custom comparator
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Sort the elements in descending order
                return b - a;
            }
        });

        // Print the sorted list
        System.out.println("Sorted list: " + list);
    }
}