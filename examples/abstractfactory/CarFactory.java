package designpattern.abstractfactory;

import designpattern.abstractfactory.ola.OlaFactory;
import designpattern.abstractfactory.uber.UberFactory;

public class CarFactory {

    public static Car buildCar(Vendor vendor, CarType type)
    {
        Car car = null;

        switch(vendor)
        {
            case OLA:
                car = OlaFactory.buildCar(type);
                break;

            case UBER:
                car = UberFactory.buildCar(type);
                break;

        }

        return car;

    }
}
