package oop;

public class Dolphin extends SwimmableAnimal {
    public Dolphin(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("The dolphin is swimming.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Click!");
    }
}
