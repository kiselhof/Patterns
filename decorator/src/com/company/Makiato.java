package com.company;

public class Makiato extends DecoratorCoffee {
    String _form = "Makiato";
    int _water = super._water;
    int _whipped_cream = 20;

    public  Makiato(DecoratorCoffee cofee){ }

    @Override
    public void make(){
        System.out.println(_form+" has "+_water+"ml of water"+ _whipped_cream + "of whipped cream");
    }
}
