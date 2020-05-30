package designpattern.abstractfactory.ola;

import designpattern.abstractfactory.Mini;

public class OlaMini extends Mini {
    @Override
    protected void getFeatures() {
        System.out.println("**** Features from Ola Mini: AC, Economical ****");
    }

    @Override
    protected void getFare() {
        System.out.println("7$");
    }
}
