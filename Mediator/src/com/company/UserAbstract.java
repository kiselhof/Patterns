package com.company;

public abstract class UserAbstract {
    protected ChatMediatorUI mediator;
    protected String name;

    public UserAbstract(ChatMediatorUI med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
