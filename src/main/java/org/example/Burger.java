package org.example;

public final class Burger extends FoodItem {

    private String type; // Type of burger (beef, chicken and...)
    private boolean hasCheese;
    private boolean hasLettuce;


    public Burger(String name, double price, String type, boolean hasCheese, boolean hasLettuce) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
        this.hasLettuce = hasLettuce;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Type: " + type;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.1;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Price: " + getPrice() + ", HasCheese: " + hasCheese + ", Type: " + type;
    }
}
