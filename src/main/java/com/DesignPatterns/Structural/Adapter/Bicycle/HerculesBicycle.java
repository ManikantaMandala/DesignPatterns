package com.DesignPatterns.Structural.Adapter.Bicycle;

public class HerculesBicycle implements Bicycle{
    @Override
    public boolean doesPollute() {
        System.out.println("It environmental friendly");
        return false;
    }

    @Override
    public void energy() {
        System.out.println("It uses human efforts");
    }
}
