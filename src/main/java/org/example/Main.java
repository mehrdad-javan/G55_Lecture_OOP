package org.example;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true, true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "Chicken", false, true);
        System.out.println(cheeseBurger.getDescription());
        System.out.println(chickenBurger.getDescription());
    }
}