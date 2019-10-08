package com.company;

public class DecoratorCoffee extends Espresso {
    protected Espresso _decorated_coffee;

    public DecoratorCoffee(Espresso _decorated_coffee){
        this._decorated_coffee = _decorated_coffee;
    }

    public DecoratorCoffee() { }

    public void make(){
        _decorated_coffee.make();
    }
}
