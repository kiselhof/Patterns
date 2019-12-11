package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.get_instance();
        singleton.Print();
    }
}
