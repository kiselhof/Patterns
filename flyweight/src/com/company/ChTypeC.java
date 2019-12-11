package com.company;

public class ChTypeC extends CharacterAbstracts {
    public ChTypeC(){
        symbol = "C";
        width = 30;
        height = 40;
    }
    @Override
    public void printCharacter() {
        System.out.println("Symbol: " + symbol + " ,width: " + width + " ,height: " + height);
    }
}
