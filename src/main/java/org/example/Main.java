package org.example;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true, true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "Chicken", false, true);
        Fries fries = new Fries(Size.S, true, false);
        Fries mediumFries = new Fries();

        FoodOrderItem foodOrderItem = new FoodOrderItem();
        foodOrderItem.addItem(cheeseBurger);
        foodOrderItem.addItem(chickenBurger);
        foodOrderItem.addItem(fries);
        foodOrderItem.addItem(mediumFries);
        foodOrderItem.displayItems();


    }
}