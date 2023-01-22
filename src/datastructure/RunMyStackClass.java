package datastructure;

public class RunMyStackClass {
    public static void main(String[] args) {
        MyStackClass<String> stack = new MyStackClass<>();
        stack.push("blue");
        stack.push("red");
        stack.push("yellow");
        System.out.println(stack);
        try {
            System.out.println("Popped item: " + stack.pop());
        } catch (MyStackException e) {
            throw new RuntimeException(e);
        }
    }
}
