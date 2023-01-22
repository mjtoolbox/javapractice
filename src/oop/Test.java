package oop;

public class Test {
    public static void main(String[] args) {
        // Create an instance of the Cat class
        Cat cat = new Cat("Fluffy", 3);
        cat.setName("Mittens");
        System.out.println("Cat name: " + cat.getName());
        cat.makeNoise();

        // Create an instance of the Dog class
        Dog dog = new Dog("Buddy", 5);
        dog.setAge(6);
        System.out.println("Dog age: " + dog.getAge());
        dog.makeNoise();

        // Create an instance of the Horse class
        Horse horse = new Horse("Thunder", 8);
        System.out.println("Horse name: " + horse.getName());
        horse.makeNoise();

        // Create an instance of the Dolphin class
        Dolphin dolphin = new Dolphin("Splash", 2);
        dolphin.swim();
        dolphin.makeNoise();

        // Create an instance of the Bird class
        Bird bird = new Bird("Tweety", 1);
        try {
            bird.fly();
        } catch (WeakTraitsException e) {
            throw new RuntimeException(e);
        }
        bird.makeNoise();

        // Create an instance of the Fish class
        Fish fish = new Fish("Goldie", 0);
        fish.swim();
        fish.makeNoise();
        fish.eatFish();

        // Polymorphism
        Animal myDog = new Dog( "Doggy", 1);
        Animal myCat = new Cat("Kitty", 1);
        myDog.makeNoise();
        myCat.makeNoise();

        Bird myChicken = new Chicken("mychicken", 1);
        try {
            myChicken.fly();
        } catch (WeakTraitsException e) {
            System.out.println("Hello, mychicken has a weak trait: " + e.getMessage());
        }

    }
}
