package com.dmch.design.patterns.prototype;

import com.sun.org.apache.xml.internal.utils.ObjectVector;

public class PrototypeApp {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 180);
        System.out.println(nissan); // Car{model='Nissan', speed=180}
        Car anoterNissan = (Car) nissan.copy();
        System.out.println(anoterNissan); // Car{model='Nissan', speed=180}
        CarFactory carFactory = new CarFactory(new Car("Hyundai", 170));
        Car car1 = carFactory.makeCopy();
        Car car2 = carFactory.makeCopy();
        System.out.println(car1); // Car{model='Hyundai', speed=170}
        System.out.println(car2); // Car{model='Hyundai', speed=170}
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
        return "Car{" + "model='" + model + '\'' + ", speed=" + speed + '}';
    }
    public Object copy() {
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
        return (Car) car.copy();
    }
}