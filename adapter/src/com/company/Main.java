package com.company;

public class Main {

    public static void main(String[] args) {

        SamsungPrinter samsung_printer = new SamsungPrinter();
        SamsungAdapter samsung_adapter = new SamsungAdapter(samsung_printer);
        samsung_adapter.Print();


    }
}
