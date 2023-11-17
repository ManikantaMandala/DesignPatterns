package com.DesignPatterns.Prototype.Register;

import com.DesignPatterns.Prototype.Object.Prototype;
import com.DesignPatterns.Prototype.Object.Wheel;
import com.DesignPatterns.Prototype.Object.WheelType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registry{
    private Map<String, Wheel> registry = new HashMap<>();

    public Wheel findByRadius(int radius, WheelType wheelType){
         List<Wheel> wheels = registry.keySet()
                .stream()
                .filter(r -> registry.get(r).getRadius() == radius && registry.get(r).getWheelType().equals(wheelType))
                .map(k -> registry.get(k))
                .toList();
         return wheels.get(0);
    }

    public void addItem(Wheel prototype){
        registry.put(prototype.getWheelType().toString()+prototype.getRadius(),prototype);
    }


}
