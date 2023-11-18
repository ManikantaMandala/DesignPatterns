package com.DesignPatterns.Structural.Adapter.Bike;

public class KTM250 implements Bike{
    @Override
    public boolean doesPollutes() {
        System.out.println("It pollutes the environment");
        return true;
    }

    @Override
    public void fuel() {
        System.out.println("It's a mixture of 80% Petrol and 20% ethanol");
    }
}
