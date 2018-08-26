package com.dmch.design.patterns.bridge;

/**
 * Created by Dmitrii on 19.07.2018.
 */
public class BridgeApp {
    public static void main(String[] args) {
        Car sedan = new Sedan(new Kia());
        sedan.getDetails();
        //Kia
        //Sedan

        Car crossover = new Crossover(new Nissan());
        crossover.getDetails();
        //Nissan
        //Crossover
    }
}
interface Make {
    void getMake();
}
class Nissan implements Make{
    public void getMake() {
        System.out.println("Nissan");
    }
}
class Kia implements Make{
    public void getMake() {
        System.out.println("Kia");
    }
}

abstract class Car{
    Make make;
    public Car(Make make) {
        this.make = make;
    }
    abstract void getType();
    public void getDetails(){
        make.getMake();
        getType();
    }
}
class Sedan extends Car{
    public Sedan(Make make) {
        super(make);
    }
    void getType() {
        System.out.println("Sedan");
    }
}
class Crossover extends Car{
    public Crossover(Make make) {
        super(make);
    }
    void getType() {
        System.out.println("Crossover");
    }
}