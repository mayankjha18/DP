package designpattern.abstractfactory.uber;

import designpattern.abstractfactory.Car;
import designpattern.abstractfactory.CarType;
import designpattern.abstractfactory.ola.OlaMini;
import designpattern.abstractfactory.ola.OlaSedan;

public class UberFactory {

    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MINI:
                car = new UberMini();
                break;

            case SEDAN:
                car = new UberSedan();
                break;

            default:
                break;
        }
        return car;
    }
}
