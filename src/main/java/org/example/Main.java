package org.example;

public class Main {
    public static void main(String[] args) {
        /*Car volvo1 = new Car();
        volvo1.setBrand("Volvo");
        volvo1.setModel("XC60");
        volvo1.move(10);
        System.out.println(volvo1.getCarInfo());
         */

        Car bmw = new Car("BMW", "X6");
        System.out.println(bmw.getCarInfo()); // 2025
        Car volvo1 = new Car("Volvo", "V60");
        System.out.println(volvo1.getCarInfo()); // 2025
        Car volvo2 = new Car("Volvo", "XC60", 2024);
        volvo2.setBrand("VOLVO");
        System.out.println(volvo2.getCarInfo());


    }
}