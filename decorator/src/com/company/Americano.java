package com.company;

public class Americano extends DecoratorCoffee {
    String _form = "Americano";
    int _water = 120;
    public Americano(DecoratorCoffee cofee){
            }

    @Override
    public void make() {
          System.out.println(_form+" has "+_water+"ml of water");
    }
}
