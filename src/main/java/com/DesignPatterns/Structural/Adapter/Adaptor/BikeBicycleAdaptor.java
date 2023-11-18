package com.DesignPatterns.Structural.Adapter.Adaptor;

import com.DesignPatterns.Structural.Adapter.Bicycle.Bicycle;
import com.DesignPatterns.Structural.Adapter.Bike.Bike;

public class BikeBicycleAdaptor implements Bicycle{
    Bike bike;

    public BikeBicycleAdaptor(Bike bike){
        this.bike = bike;
    }
    @Override
    public boolean doesPollute() {
        bike.doesPollutes();
        return false;
    }

    @Override
    public void energy() {
        bike.fuel();
    }
}
