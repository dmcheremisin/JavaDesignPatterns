package com.dmch.hf.strategy;

public interface QuackBehavior{
    void quack();
}
class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("I can't quack =(");
    }
}
