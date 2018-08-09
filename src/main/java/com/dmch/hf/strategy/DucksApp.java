package com.dmch.hf.strategy;

import com.dmch.hf.strategy.realization.MallardDuck;

/*
We have 4 types of ducks: Decoy, Mallard, Redhead, Rubber.
All of them have one thing in common - they can swim.
Every instance provides its own realization of abstract Duck class method - display()

Strategy pattern here is realized in following:
1. every duck have 2 methods: performFly() and performQuack()
2. these methods call internally their own fields: flyBehavior.fly() and quackBehavior.quack()
3. in runtime we can set these fields to any realization of QuackBehavior or FlyBehavior
4. by default these fields are set to NoFly and Mute
 */
public class DucksApp {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();

        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        /*
        I can't fly =(
        I can't quack =(
        Boys have green head, girls have grey head.
        All ducks swim!
        Flying with wings!
        Quack
         */
    }
}

