package com.DesignPatterns.Creational.AbstractFactory.AbstractFactory;

import com.DesignPatterns.Creational.AbstractFactory.Products.Bed.Bed;
import com.DesignPatterns.Creational.AbstractFactory.Products.Bed.WoodenBed;
import com.DesignPatterns.Creational.AbstractFactory.Products.Chair.Chair;
import com.DesignPatterns.Creational.AbstractFactory.Products.Chair.WoodenChair;

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
