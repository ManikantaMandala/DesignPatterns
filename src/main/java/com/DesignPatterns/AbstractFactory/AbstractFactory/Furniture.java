package com.DesignPatterns.AbstractFactory.AbstractFactory;

import com.DesignPatterns.AbstractFactory.Products.Bed.Bed;
import com.DesignPatterns.AbstractFactory.Products.Chair.Chair;

public abstract class Furniture {
    Bed bed = null;
    Chair chair = null;

    public Furniture(){
        this.bed = createBed();
        this.chair = createChair();
    }
    abstract Bed createBed();
    abstract Chair createChair();

    @Override
    public String toString() {
        return "Furniture{" +
                "bed=" + bed.descBed() +
                ", chair=" + chair.descChair() +
                '}';
    }
}
