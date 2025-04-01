package org.example;

public enum Size {
    S("Small" , 4.99 ),
    M("Medium", 8.99),
    L("Large" , 10.99);

    private String title;
    private double price;

    Size(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
