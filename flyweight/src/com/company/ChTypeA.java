package com.company;

public class ChTypeA extends CharacterAbstracts {
    public ChTypeA(){
        symbol = "A";
        width = 10;
        height = 20;
    }

    @Override
    public void printCharacter() {
        System.out.println("Symbol: " + symbol + " ,width: " + width + " ,height: " + height);
    }
}
