package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String _name;
    List<String> _accessories = new ArrayList<>();

    public String toString(){
        return "Model car: " + _name + "\n" + _accessories;
    }
}
