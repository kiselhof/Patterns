package com.company;

public class Main {

    public static void main(String[] args) {

        UIOfficeInternetAccess access1 = new ProxyInternetAccess("Anna", 7);
        access1.grantInternetAccess();

        UIOfficeInternetAccess access2 = new ProxyInternetAccess("Olga", 1);
        access2.grantInternetAccess();
    }
}