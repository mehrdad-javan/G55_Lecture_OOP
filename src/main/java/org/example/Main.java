package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*Car volvo1 = new Car();
        volvo1.setBrand("Volvo");
        volvo1.setModel("XC60");
        volvo1.move(10);
        System.out.println(volvo1.getCarInfo());
         */

        Car bmw = new Car("BMW", "X6");
        Car volvo1 = new Car("Volvo", "V60");
        Car volvo2 = new Car("Volvo", "XC60", 2024);
        volvo2.setBrand("VOLVO");


        Person person1 = new Person("1", "Simon Elbrink", "simon@lexicon.se", LocalDate.parse("2000-01-01"));
        Person person2 = new Person("2", "Marcus Gudmundsen", "marcus@lexicon.se", LocalDate.parse("1989-01-01"));

        bmw.setOwner(person1);
        volvo1.setOwner(person1);


        System.out.println(bmw.getCarInfo());
        System.out.println(volvo1.getCarInfo());
        System.out.println(volvo2.getCarInfo());


    }
}