package com.DesignPatterns.Creational.FactoryMethod.Creator;

import com.DesignPatterns.Creational.FactoryMethod.Product.Transport;

//Base factory class
public abstract class Logistics {
    private Transport transport;
    public boolean planDelivery(){
        transport = createTransport();
        transport.deliver();
        return transport != null;
    }
    //Factory method
    abstract Transport createTransport();
}
