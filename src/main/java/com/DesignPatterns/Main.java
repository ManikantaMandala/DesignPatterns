package com.DesignPatterns;
import com.DesignPatterns.Creational.Builder.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = Person.builder()
                .name("Manikanta")
                .age(21)
                .emailId("mandala.mallik@gmail.com")
                .phoneNumber("+91-8688014820")
                .build();
        System.out.println(p1.toString());
    }
}