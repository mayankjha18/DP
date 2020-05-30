package designpattern.abstractfactory.uber;

import designpattern.abstractfactory.Sedan;

public class UberSedan extends Sedan {
    @Override
    protected void getFeatures() {
        System.out.println("**** Features from Uber Sedan: AC, Luxury Seats ****");
    }

    @Override
    protected void getFare() {
        System.out.println("9$");
    }
}
