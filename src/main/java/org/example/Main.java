package org.example;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true, true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "Chicken", false, true);
        System.out.println(cheeseBurger.toString());
        System.out.println(chickenBurger);
        System.out.println(cheeseBurger.calculateTax());
        System.out.println(chickenBurger.calculateTax());

        Fries fries = new Fries(Size.S, true, false);
        System.out.println(fries);
        System.out.println(fries.calculateTax());
        Fries mediumFries = new Fries();
        System.out.println(mediumFries);


    }
}