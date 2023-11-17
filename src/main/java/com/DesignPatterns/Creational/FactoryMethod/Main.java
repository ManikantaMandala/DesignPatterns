package com.DesignPatterns.Creational.FactoryMethod;

import com.DesignPatterns.Creational.FactoryMethod.Creator.Logistics;
import com.DesignPatterns.Creational.FactoryMethod.Creator.RoadLogistics;
import com.DesignPatterns.Creational.FactoryMethod.Creator.SeaLogistics;

import java.util.Scanner;

//Creator's code
public class Main {
    static Logistics logistics;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        configure(type);
        logistics.planDelivery();

        sc.close();
    }
    public static void configure(String type){
        if(type.equals("Road")) logistics = new RoadLogistics();
        else logistics = new SeaLogistics();
    }
}
