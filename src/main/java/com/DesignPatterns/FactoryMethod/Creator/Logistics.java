package com.DesignPatterns.FactoryMethod.Creator;

import com.DesignPatterns.FactoryMethod.Product.Transport;

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
