package com.dmch.hf.combinedPatterns;

import com.dmch.hf.combinedPatterns.adapter.Goose;
import com.dmch.hf.combinedPatterns.adapter.GooseAdapter;
import com.dmch.hf.combinedPatterns.composite.Flock;
import com.dmch.hf.combinedPatterns.decorator.QuackCounter;
import com.dmch.hf.combinedPatterns.duckFactory.AbstractDuckFactory;
import com.dmch.hf.combinedPatterns.duckFactory.CountingDuckFactory;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class Main {
    public static void main(String[] args) {
        AbstractDuckFactory factory = new CountingDuckFactory();

        Flock flockOfDucks = new Flock();
        flockOfDucks.addQuackable(factory.createRedHeadDuck());
        flockOfDucks.addQuackable(factory.createDuckCall());
        flockOfDucks.addQuackable(factory.createRubberDuck());
        // goose as duck, quacks doesn't counted
        flockOfDucks.addQuackable(new GooseAdapter(new Goose()));

        Flock flockOfMallardDucks = new Flock();
        flockOfDucks.addQuackable(factory.createMallardDuck());
        flockOfDucks.addQuackable(factory.createMallardDuck());
        flockOfDucks.addQuackable(factory.createMallardDuck());
        flockOfDucks.addQuackable(factory.createMallardDuck());

        flockOfDucks.addQuackable(flockOfMallardDucks);

        simulate(flockOfDucks);

        System.out.println("Total quacks: " + QuackCounter.getQuacks());
    }

    public static void simulate(Quackable quackable){
        quackable.quack();
    }
}
