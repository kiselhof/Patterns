package com.company;

public class Singleton {
    private static Singleton _instance;

    private Singleton(){}

    public static Singleton get_instance(){
        if(_instance == null){
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }

    public void Print() {
        System.out.println("Singleton");
    }
}
