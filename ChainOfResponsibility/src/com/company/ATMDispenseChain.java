package com.company;


public class ATMDispenseChain {
    private DispenseChainUI c1;

    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChainUI c2 = new Dollar20Dispenser();
        DispenseChainUI c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    public DispenseChainUI get_c1(){ return this.c1;}
}
