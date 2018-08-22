package com.dmch.design.patterns.prototype;


public class PrototypeApp {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 180);
        Car anoterNissan = nissan.copy();
        System.out.println(anoterNissan); // Car{model='Nissan', speed=180}

        CarFactory factory = new CarFactory(new Car("Hyundai", 170));
        Car hyundai = factory.makeCopy();
        System.out.println(hyundai); // Car{model='Hyundai', speed=170}
    }
}

interface Copyable{
    Object copy();
}
class Car implements Copyable{
    private String model;
    private int speed;
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
    public String toString() {
        return "Car{" + "model='" + model + "', speed=" + speed + '}';
    }
    public Car copy() {
        return new Car(model, speed);
    }
}
class CarFactory{
    private Car car;
    public CarFactory(Car car) {
        this.car = car;
    }
    public void setPrototype(Car car) {
        this.car = car;
    }
    public Car makeCopy(){
        return car.copy();
    }
}