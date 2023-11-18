package com.DesignPatterns.Structural.Adapter.Bike;

public interface Bike {
    // The method names are different
    // but return type is same as Bicycle
    boolean doesPollutes();
    void fuel();
}
