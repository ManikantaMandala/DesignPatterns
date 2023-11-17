package com.DesignPatterns.AbstractFactory;

import com.DesignPatterns.AbstractFactory.AbstractFactory.Furniture;
import com.DesignPatterns.AbstractFactory.AbstractFactory.IronFurniture;
import com.DesignPatterns.AbstractFactory.AbstractFactory.PlasticFurniture;
import com.DesignPatterns.AbstractFactory.AbstractFactory.WoodenFurniture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Furniture furniture = createFurniture(type);
        description(furniture);
        sc.close();
    }

    public static Furniture createFurniture(String type){
        type = type.toLowerCase();
        switch (type){
            case "iron" :
                return new IronFurniture();
            case "plastic":
                return new PlasticFurniture();
            default:
                return new WoodenFurniture();
        }
    }
    public static void description(Furniture furniture){
        System.out.println(furniture.toString());
    }
}
