package designpattern.abstractfactory.ola;

import designpattern.abstractfactory.Sedan;

public class OlaSedan extends Sedan {
    @Override
    protected void getFeatures() {
        System.out.println("**** Features from Ola Sedan: AC, Luxury Seats, Wifi ****");
    }

    @Override
    protected void getFare() {
        System.out.println("10$");
    }
}
