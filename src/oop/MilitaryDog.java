package oop;

public class MilitaryDog extends Dog implements Trainable{

    public MilitaryDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void canPerform() {
        System.out.println("Sniff & find the enemy");
    }
}
