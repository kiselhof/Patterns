package com.company;

public class BasicCarFactory extends AbstractCarFactory {
    @Override
    public Car createcar() {
        return new BasicCar();
    }
}
