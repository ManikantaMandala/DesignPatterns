package com.DesignPatterns.Creational.FactoryMethod.Product;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by truck");
    }
}
