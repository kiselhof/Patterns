package com.company;

import java.util.ArrayList;

public class ObserversList extends EmptyObserver {
    ArrayList<Subject> _subscribers = new ArrayList<Subject>();

    public void add_subscriber(Subject subject){
        _subscribers.add(subject);
    }

    public void notify(Subject subject){
        for (int i=0; i<_subscribers.size(); ++i){
            subject.notify();
        }
        System.out.println("Subject has been created");
    }

    public void notifyObjectModified(Subject subject) {
        subject.notify();
        System.out.println("Subject has been modified");
    }



}
