package designpattern.abstractfactory.ola;

import designpattern.abstractfactory.Car;
import designpattern.abstractfactory.CarType;

public class OlaFactory {

    public static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MINI:
                car = new OlaMini();
                break;

            case SEDAN:
                car = new OlaSedan();
                break;

            default:
                break;
        }
        return car;
    }
}
