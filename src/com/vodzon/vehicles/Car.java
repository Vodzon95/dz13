package com.vodzon.vehicles;

import com.vodzon.details.Engine;
import com.vodzon.proffesions.Driver;

public class Car {

    protected final String model;
    protected final String carClass;
    protected final double weight;
    protected final Driver driver;
    protected final Engine engine;

    public String getModel() {
        return model;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, String carClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
