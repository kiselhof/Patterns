package com.company;

public class Main {

    public static void main(String[] args) {
        Dot dot = new Dot(0,0);
        Circle circle = new Circle(1,2,6);
        CompoundGraphic compundGraphic = new CompoundGraphic();
        compundGraphic.add(circle);
        compundGraphic.add(dot);

        Editor editor = new Editor();
        editor.groupSelected(compundGraphic.get_children());

    }
}
