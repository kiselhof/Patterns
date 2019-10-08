package com.company;

public class Main {

    public static void main(String[] args) {
        DecoratorCoffee coffee = new DecoratorCoffee();
        Americano americano = new Americano(coffee);
	    americano.make();

        Espresso espresso = new Espresso();
	    espresso.make();

	    Makiato makiato = new Makiato(americano);
	    makiato.make();
    }
}
