package oop;

public class Bird extends Animal implements Flyable {
    public Bird(String name, int age) {
        super(name, age);
    }

    // @Override informs the compiler to validate
    @Override
    public void fly() throws WeakTraitsException {
        System.out.println("The bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp!");
    }
}