package com.DesignPatterns.AbstractFactory.AbstractFactory;

import com.DesignPatterns.AbstractFactory.Products.Bed.Bed;
import com.DesignPatterns.AbstractFactory.Products.Bed.IronBed;
import com.DesignPatterns.AbstractFactory.Products.Chair.Chair;
import com.DesignPatterns.AbstractFactory.Products.Chair.PlasticChair;

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
