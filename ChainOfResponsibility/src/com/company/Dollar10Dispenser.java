package com.company;

public class Dollar10Dispenser implements DispenseChainUI {
    private DispenseChainUI chain;

    @Override
    public void setNextChain(DispenseChainUI nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.get_amount() >= 10){
            int num = cur.get_amount()/10;
            int remainder = cur.get_amount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
