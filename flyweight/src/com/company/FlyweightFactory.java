package com.company;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Integer, CharacterAbstracts> characters = new HashMap();

    public CharacterAbstracts getCharacter(int characterCode){
        CharacterAbstracts character = characters.get(new Integer(characterCode));
        if (character == null){
            switch (characterCode){
                case 1 : {
                    character = new ChTypeA();
                    break;
                }
                case 2 : {
                    character = new ChTypeB();
                    break;
                }
                case 3 : {
                    character = new ChTypeC();
                    break;
                }
            }
            characters.put(characterCode, character);
        }
        return character;
    }
}