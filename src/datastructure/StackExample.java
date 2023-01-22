package datastructure;

// Stack data structure
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // Print the stack
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());

        // Pop an element from the stack
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        // Print the stack
        System.out.println("Stack: " + stack);
    }
}