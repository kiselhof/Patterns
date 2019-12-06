package com.company;

public class LuxCarFactory extends AbstractCarFactory {
    @Override
    public Car createcar() {
        return new LuxCar();
    }
}
