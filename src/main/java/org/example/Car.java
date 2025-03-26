package org.example;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    private final String vin;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int mileage;

    /*public Car(){
        this.vin = null;
        this.brand = null;
        this.model = null;
        this.year = 0;
        this.mileage = 0;
    }*/

    public Car(String brand, String model, int year) {
        this.vin = UUID.randomUUID().toString();
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    public Car(String brand, String model) {
        // Constructor Chaining
        this(brand, model, LocalDate.now().getYear());
    }


    // getters and setters
    public String getVin() {
        return vin; // it returns the read only value of vin
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) { // Volvo
        if (brand == null || brand.trim().isEmpty())
            throw new IllegalArgumentException("Brand should not be null or empty.");
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty())
            throw new IllegalArgumentException("Model should not be null or empty.");
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 1885 && year <= LocalDate.now().plusYears(1).getYear()) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid Year.");
        }
    }


    public void setColor(String color) {
        if (color == null) this.color = "Gray";
        else this.color = color;
    }

    public void move(int miles) {
        if (miles > 0) {
            mileage += miles;
        } else {
            throw new IllegalArgumentException("Invalid Miles.");
        }
    }

    public String getCarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car Info -> ")
                .append(" VIN ").append(vin)
                .append(", Brand ").append(brand)
                .append(", Model ").append(model)
                .append(", Year ").append(year)
                .append(", Mileage ").append(mileage);
        return sb.toString();
    }

}
