package com.company;

public class User extends UserAbstract {
    public User(ChatMediator med, String name) {
        super(med, name);
    }

    // send() has no idea how it will be handled by the mediator
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message: "+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
