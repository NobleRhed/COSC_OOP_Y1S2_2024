package org.dc.anijava.oopbasic;

import org.dc.anijava.oopbasic.Animal;

public class gecko implements Animal {
    private int numberOfLegs;
    public gecko() {
        System.out.println("Inside gecko constructor.");
    }

    public gecko(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        System.out.println("Inside gecko constructor with legs");
    }

    @Override
    public void canRun() {

    }
}
