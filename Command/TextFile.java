package com.company;

public class TextFile {
    private String _name;

    public String open(){
        return "Opening file" + _name;
    }
    public String save(){
        return "Saving file" + _name;
    }
}
