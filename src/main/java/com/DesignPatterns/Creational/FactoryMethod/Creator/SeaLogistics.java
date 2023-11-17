package com.DesignPatterns.Creational.FactoryMethod.Creator;

import com.DesignPatterns.Creational.FactoryMethod.Product.Ship;
import com.DesignPatterns.Creational.FactoryMethod.Product.Transport;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
