package com.company;

public class ChTypeB extends CharacterAbstracts {
    public ChTypeB(){
        symbol = "B";
        width = 20;
        height = 30;
    }
    @Override
    public void printCharacter() {
        System.out.println("Symbol: " + symbol + " ,width: " + width + " ,height: " + height);
    }
}
