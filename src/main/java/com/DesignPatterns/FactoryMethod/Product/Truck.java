package com.DesignPatterns.FactoryMethod.Product;

import com.DesignPatterns.FactoryMethod.Product.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by truck");
    }
}
