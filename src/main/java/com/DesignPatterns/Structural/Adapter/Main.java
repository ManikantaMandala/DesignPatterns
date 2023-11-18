package com.DesignPatterns.Structural.Adapter;

import com.DesignPatterns.Structural.Adapter.Adaptor.BicycleBikeAdaptor;
import com.DesignPatterns.Structural.Adapter.Adaptor.BikeBicycleAdaptor;
import com.DesignPatterns.Structural.Adapter.Bicycle.Bicycle;
import com.DesignPatterns.Structural.Adapter.Bicycle.HerculesBicycle;
import com.DesignPatterns.Structural.Adapter.Bike.Bike;
import com.DesignPatterns.Structural.Adapter.Bike.KTM250;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new HerculesBicycle();
        Bike bike = new KTM250();

        System.out.println("Bike");
        descBike(bike);

        System.out.println("\nBicycle");
        descBicycle(bicycle);

        System.out.println("\nBikeBicycleAdaptor");
        BikeBicycleAdaptor bikeBicycleAdaptor = new BikeBicycleAdaptor(bike);
        descBicycle(bikeBicycleAdaptor);

        System.out.println("\nBicycleBikeAdaptor");
        BicycleBikeAdaptor bicycleBikeAdaptor = new BicycleBikeAdaptor(bicycle);
        descBike(bicycleBikeAdaptor);
    }
    public static void descBicycle(Bicycle bicycle){
        bicycle.doesPollute();
        bicycle.energy();
    }
    public static void descBike(Bike bike){
        bike.doesPollutes();
        bike.fuel();
    }
}
