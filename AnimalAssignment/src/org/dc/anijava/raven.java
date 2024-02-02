package org.dc.anijava;

public class raven implements Animal{
    private int numberOfLegs;
    public raven() {
        System.out.println("Inside raven constructor.");
    }

    public raven(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        System.out.println("Inside raven constructor with legs" + numberOfLegs);
    }

    @Override
    public void canRun() {

    }
}
