package com.company;

public class Circle extends Dot {
    private int _radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this._radius = radius;
    }

    public void get_coordinats(){
        System.out.println("Circle with centre in "+ "("+ super.get_x() + "," + super.get_y() +  ")"+ "and radius is " + this._radius);
    }
}
