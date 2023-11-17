package com.DesignPatterns.Creational.FactoryMethod.Creator;

import com.DesignPatterns.Creational.FactoryMethod.Product.Transport;
import com.DesignPatterns.Creational.FactoryMethod.Product.Truck;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Truck();
    }
}
