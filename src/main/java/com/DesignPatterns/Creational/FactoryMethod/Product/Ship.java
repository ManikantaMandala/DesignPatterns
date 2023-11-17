package com.DesignPatterns.Creational.FactoryMethod.Product;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by ship");
    }
}
