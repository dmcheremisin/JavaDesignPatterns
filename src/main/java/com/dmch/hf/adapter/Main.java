package com.dmch.hf.adapter;

import com.dmch.hf.adapter.impl.MallardDuck;
import com.dmch.hf.adapter.impl.TurkeyToDuckAdapter;

/**
 * Created by Dmitrii on 14.08.2018.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        Turkey turkey = new Turkey();
        Duck duck = new TurkeyToDuckAdapter(turkey);
        duck.quack();
        duck.fly();

//        Quack!
//        I'm flying high!
//        Gobble gobble
//        I'm trying to fly
    }
}
