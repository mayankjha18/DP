package designpattern.abstractfactory;

import designpattern.abstractfactory.ola.OlaFactory;
import designpattern.abstractfactory.uber.UberFactory;

public class Main {
    public static void main(String args[])
    {
        Car car = CarFactory.buildCar(Vendor.UBER, CarType.SEDAN);
        car.getFare();
        car.getFeatures();
        car.getCapacity();
    }
}
