package com.DesignPatterns.Structural.Adapter.Adaptor;

import com.DesignPatterns.Structural.Adapter.Bicycle.Bicycle;
import com.DesignPatterns.Structural.Adapter.Bike.Bike;

public class BicycleBikeAdaptor implements Bike {
    Bicycle bicycle;
    public BicycleBikeAdaptor(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    @Override
    public boolean doesPollutes() {
        bicycle.doesPollute();
        return false;
    }

    @Override
    public void fuel() {
        bicycle.energy();
    }
}
