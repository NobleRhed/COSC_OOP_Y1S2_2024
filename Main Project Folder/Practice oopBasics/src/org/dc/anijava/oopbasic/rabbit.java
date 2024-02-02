package org.dc.anijava.oopbasic;

import org.dc.anijava.oopbasic.Animal;

public class rabbit implements Animal {
    private int numberOfLegs;
    public rabbit() {
        System.out.println("Inside rabbit constructor.");
    }

    public rabbit(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        System.out.println("Inside raven constructor with legs");
    }

    @Override
    public void canRun() {

    }
}


