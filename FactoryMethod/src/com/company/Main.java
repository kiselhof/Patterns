package com.company;

public class Main {
    public static void main(String[] args) {
        AbstractCarFactory myLuxFactory = new LuxCarFactory();
        AbstractCarFactory myBasicFactory = new BasicCarFactory();

        Car myLuxCar = myLuxFactory.createcar();
        Car myBasicCar = myBasicFactory.createcar();

        System.out.println(myLuxCar);
        System.out.println(myBasicCar);
    }
}
