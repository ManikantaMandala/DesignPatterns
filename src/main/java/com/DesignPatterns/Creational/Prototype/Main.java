package com.DesignPatterns.Creational.Prototype;

import com.DesignPatterns.Creational.Prototype.Object.Wheel;
import com.DesignPatterns.Creational.Prototype.Object.WheelType;
import com.DesignPatterns.Creational.Prototype.Register.Registry;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Wheel w1 = Wheel.builder()
                .radius(12)
                .wheelType(WheelType.SPOKE)
                .build();
        registry.addItem(w1);
        Wheel w2 = registry.findByRadius(12, WheelType.SPOKE);
        Wheel w3 = w2.clone();
        w3.setTyreName("MRF");
        System.out.println(w3.toString());
        System.out.print(w2.toString());
    }
}
