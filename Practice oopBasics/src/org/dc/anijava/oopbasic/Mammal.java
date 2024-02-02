package org.dc.anijava.oopbasic;

public class Mammal implements Animal {
    boolean coldBlooded = false;

    Mammal() {
        System.out.println("Inside Mammal Default constructor");
    }

    @Override
    public void canRun() {

    }

    @Override
    public void makeSound() {

    }
}

@Override
public void makeSound() {
    System.out.println(("Mammal is making a sound"));
}
