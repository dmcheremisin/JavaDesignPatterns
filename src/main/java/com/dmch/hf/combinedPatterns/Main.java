package com.dmch.hf.combinedPatterns;

import com.dmch.hf.combinedPatterns.adapter.Goose;
import com.dmch.hf.combinedPatterns.adapter.GooseAdapter;
import com.dmch.hf.combinedPatterns.composite.Flock;
import com.dmch.hf.combinedPatterns.decorator.QuackCounter;
import com.dmch.hf.combinedPatterns.duckFactory.AbstractDuckFactory;
import com.dmch.hf.combinedPatterns.duckFactory.CountingDuckFactory;
import com.dmch.hf.combinedPatterns.observable.Quackologist;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class Main {

    public static void simulate(Quackable quackable){
        quackable.quack();
    }

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

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("Total quacks(without goose quack): " + QuackCounter.getQuacks());
    }

    //Quack
    //Duck: RedheadDuck just quacked
    //Kwak
    //Duck: DuckCall just quacked
    //Squeak
    //Duck: RubberDuck just quacked
    //Honk
    //Duck: GooseAdapter just quacked
    //Quack
    //Duck: MallardDuck just quacked
    //Quack
    //Duck: MallardDuck just quacked
    //Quack
    //Duck: MallardDuck just quacked
    //Quack
    //Duck: MallardDuck just quacked
    //Total quacks(without goose quack): 7
}
