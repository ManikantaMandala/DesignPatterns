package com.DesignPatterns.AbstractFactory.AbstractFactory;

import com.DesignPatterns.AbstractFactory.Products.Bed.Bed;
import com.DesignPatterns.AbstractFactory.Products.Bed.WoodenBed;
import com.DesignPatterns.AbstractFactory.Products.Chair.Chair;
import com.DesignPatterns.AbstractFactory.Products.Chair.WoodenChair;

public class WoodenFurniture extends Furniture{
    @Override
    public Bed createBed() {
        return new WoodenBed();
    }

    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

}
