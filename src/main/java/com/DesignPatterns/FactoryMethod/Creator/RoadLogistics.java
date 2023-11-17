package com.DesignPatterns.FactoryMethod.Creator;

import com.DesignPatterns.FactoryMethod.Creator.Logistics;
import com.DesignPatterns.FactoryMethod.Product.Transport;
import com.DesignPatterns.FactoryMethod.Product.Truck;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Truck();
    }
}
