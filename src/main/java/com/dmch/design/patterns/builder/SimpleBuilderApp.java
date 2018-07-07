package com.dmch.design.patterns.builder;

public class SimpleBuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildModel("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(220)
                .build();
        System.out.println(car); // Car{model='Mercedes', transmission=AUTO, maxSpeed=220}
    }
}
enum Transmission{
    MANUAL, AUTO
}
class Car{
    private String model;
    private Transmission transmission;
    private int maxSpeed;
    public void setModel(String model) {
        this.model = model;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", transmission=" + transmission + ", maxSpeed=" + maxSpeed +'}';
    }
}
class CarBuilder{
    private String model;
    private Transmission transmission;
    private int maxSpeed;
    public CarBuilder buildModel(String model) {
        this.model = model;
        return this;
    }
    public CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }
    public CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public Car build(){
        Car car = new Car();
        car.setModel(model);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}