package oop;

public abstract class SwimmableAnimal extends Animal {
    public SwimmableAnimal(String name, int age) {
        super(name, age);
    }

    public abstract void swim();

    public void eatFish(){
        System.out.println("Sure can eat fish");
    }
}
