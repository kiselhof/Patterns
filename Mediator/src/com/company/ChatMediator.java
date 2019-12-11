package com.company;

import java.util.ArrayList;
import java.util.List;

//the class has a list of users in the group
//and provides logic for the communication
// between the users
public class ChatMediator implements ChatMediatorUI {
    private List<UserAbstract> users;

    public ChatMediator(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(UserAbstract user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, UserAbstract user) {
        for(UserAbstract u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }
}
