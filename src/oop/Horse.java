package oop;

public class Horse extends Animal {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }
}