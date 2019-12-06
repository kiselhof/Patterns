package com.company;

public class ComplicatedObject implements CopyableUI {
    public enum Type {
        ONE, TWO
    }
    @Override
    public ComplicatedObject copy(){
        return new ComplicatedObject();
    }
    public void setType(Type type){
        this.Type = type;
    }
}
