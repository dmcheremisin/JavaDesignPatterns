package com.dmch.design.patterns.builder;

public class BuilderWithDirector {
    public static void main(String[] args) {
        Director director = new Director();
        Car nissan = director.buildCar(new NissanBuilder());
        System.out.println(nissan); // Car{model='Nissan Quashqai', transmission=AUTO, maxSpeed=180}

        Car huyndai = director.buildCar(new HuyndaiBuilder());
        System.out.println(huyndai); // Car{model='Huyndai Sonata', transmission=MANUAL, maxSpeed=160}
    }
}

class Director {
    public Car buildCar(AbstractCarBuilder builder){
        builder.createCar();
        builder.buildModel();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        return builder.getCar();
    }
}

abstract class AbstractCarBuilder {
    Car car;
    public void createCar(){
        this.car = new Car();
    }
    public Car getCar(){
        return car;
    }

    abstract void buildModel();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();
}
class NissanBuilder extends AbstractCarBuilder {
    void buildModel() {
        car.setModel("Nissan Quashqai");
    }
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }
    void buildMaxSpeed() {
        car.setMaxSpeed(180);
    }
}
class HuyndaiBuilder extends AbstractCarBuilder {
    void buildModel() {
        this.car.setModel("Huyndai Sonata");
    }
    void buildTransmission() {
        this.car.setTransmission(Transmission.MANUAL);
    }
    void buildMaxSpeed() {
        this.car.setMaxSpeed(160);
    }
}

