package designpattern.abstractfactory.uber;

import designpattern.abstractfactory.Mini;

public class UberMini extends Mini {
    @Override
    protected void getFeatures() {
        System.out.println("**** Features from Uber Mini: AC, Economical ****");
    }

    @Override
    protected void getFare() {
        System.out.println("6$");
    }
}
