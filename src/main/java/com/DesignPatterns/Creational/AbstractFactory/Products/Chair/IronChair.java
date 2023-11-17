package com.DesignPatterns.Creational.AbstractFactory.Products.Chair;

public class IronChair implements Chair{
    @Override
    public String descChair() {
        return "This chair is made of iron";
    }
}
