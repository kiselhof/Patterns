package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        client program has no idea how the message is getting handled
         and if mediator is getting user or not.
         */
        ChatMediator mediator = new ChatMediator();
        UserAbstract user1 = new User(mediator, "Pankaj");
        UserAbstract user2 = new User(mediator, "Lisa");
        UserAbstract user3 = new User(mediator, "Saurabh");
        UserAbstract user4 = new User(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
