package com.company;

public class Espresso implements  UICoffee{
    String _form = "Espresso";
    int _water = 30;
    int _milk = 0;
    int _whipped_cream = 0;

    public Espresso(){    }
    @Override
    public void make() {
        System.out.println("Your cup of coffee consists of " + _water+"ml of water");
    }
}
