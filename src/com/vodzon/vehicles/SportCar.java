package com.vodzon.vehicles;

import com.vodzon.details.Engine;
import com.vodzon.proffesions.Driver;

public class SportCar extends Car {

    private final double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public SportCar(String model, String carClass, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(model, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}