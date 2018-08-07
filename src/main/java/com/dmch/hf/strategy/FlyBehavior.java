package com.dmch.hf.strategy;

public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly =(");
    }
}