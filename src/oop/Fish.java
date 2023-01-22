package oop;

public class Fish extends SwimmableAnimal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }

    // Method to make the fish make a noise (polymorphism)
    @Override
    public void makeNoise() {
        System.out.println("Glub!");
    }

}