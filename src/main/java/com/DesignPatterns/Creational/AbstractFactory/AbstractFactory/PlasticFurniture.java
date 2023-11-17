package com.DesignPatterns.Creational.AbstractFactory.AbstractFactory;

import com.DesignPatterns.Creational.AbstractFactory.Products.Bed.Bed;
import com.DesignPatterns.Creational.AbstractFactory.Products.Bed.IronBed;
import com.DesignPatterns.Creational.AbstractFactory.Products.Chair.Chair;
import com.DesignPatterns.Creational.AbstractFactory.Products.Chair.PlasticChair;

public class PlasticFurniture extends Furniture{
    @Override
    public Bed createBed() {
        return new IronBed();
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

}
