package com.DesignPatterns.Structural.Adapter.Bicycle;

public interface Bicycle {
    // The method names are different
    // but return type is same as Bike
    boolean doesPollute();
    void energy();
}
