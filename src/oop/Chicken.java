package oop;

public class Chicken extends Bird{
    public Chicken(String name, int age) {
        super(name, age);
    }
    @Override
    public void fly() throws WeakTraitsException {
        throw new WeakTraitsException("*** Chicken cannot fly long distance ***");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp!");
    }
}
