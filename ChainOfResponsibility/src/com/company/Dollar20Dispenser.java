package com.company;

public class Dollar20Dispenser implements DispenseChainUI {
    private DispenseChainUI chain;

    @Override
    public void setNextChain(DispenseChainUI nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.get_amount() >= 20){
            int num = cur.get_amount()/20;
            int remainder = cur.get_amount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
