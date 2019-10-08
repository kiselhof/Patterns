package com.company;

public class SamsungAdapter implements UISumsungAdapter {
    protected SamsungPrinter _printer;

    public SamsungAdapter(SamsungPrinter samsung_printer){
        this._printer = samsung_printer;
    }

    @Override
    public void Print() {
        _printer.Write();
    }
}
