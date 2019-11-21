package com.company;

public class Main {

    public static void main(String[] args) {
	ObserversList observersList = new ObserversList();
	observersList.add_subscriber(new Subject());

	observersList._subscribers.get(0).setField(new Object());


    }
}
