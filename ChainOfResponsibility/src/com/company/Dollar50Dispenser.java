package com.company;

public class Dollar50Dispenser implements DispenseChainUI {
    private DispenseChainUI chain;

    @Override
    public void setNextChain(DispenseChainUI nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.get_amount() >= 50){
            int num = cur.get_amount()/50;
            int remainder = cur.get_amount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }
}
