package org.dc.anijava;

public class fox implements Animal{
    private int numberOfLegs;
    public fox() {
        System.out.println("Inside fox constructor.");
    }

    public fox(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        System.out.println("Inside fox constructor with legs");
    }


    @Override
    public void canRun() {

    }
}
