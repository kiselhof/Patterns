package com.company;

public class Subject {
    ObserversList _observers = new ObserversList();
    private Object _field;

    public void Subject(){
        _observers.notify(this._observers);
    }

    public void setField(Object obj){
        _field = obj;
        _observers.notifyObjectModified(this._observers);
    }
}
