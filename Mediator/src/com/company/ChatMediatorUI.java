package com.company;

public interface ChatMediatorUI {
    public void sendMessage(String msg, UserAbstract user);
    void addUser(UserAbstract user);
}
