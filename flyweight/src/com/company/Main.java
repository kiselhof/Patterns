package com.company;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        int[] characterCodes = {1, 2, 3};
        for (int nextCode : characterCodes) {
            CharacterAbstracts character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }
}
