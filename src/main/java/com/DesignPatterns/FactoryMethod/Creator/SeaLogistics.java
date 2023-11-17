package com.DesignPatterns.FactoryMethod.Creator;

import com.DesignPatterns.FactoryMethod.Creator.Logistics;
import com.DesignPatterns.FactoryMethod.Product.Ship;
import com.DesignPatterns.FactoryMethod.Product.Transport;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
