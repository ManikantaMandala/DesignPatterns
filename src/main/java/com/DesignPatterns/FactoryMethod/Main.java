package com.DesignPatterns.FactoryMethod;

import com.DesignPatterns.FactoryMethod.Creator.Logistics;
import com.DesignPatterns.FactoryMethod.Creator.RoadLogistics;
import com.DesignPatterns.FactoryMethod.Creator.SeaLogistics;

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
