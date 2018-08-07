package com.dmch.hf.strategy;

public abstract class Duck{
    FlyBehavior flyBehavior = new NoFly();
    QuackBehavior quackBehavior = new Mute();

    public abstract void display();

    public void swim() {
        System.out.println("All ducks swim!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
}
