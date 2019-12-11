package com.company;

public interface DispenseChainUI {
    //define the next processor in the chain
    void setNextChain(DispenseChainUI nextChain);

    //method that will process the request
    void dispense(Currency cur);
}
