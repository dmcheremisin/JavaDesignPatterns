package com.dmch.hf.combinedPatterns.duckFactory;

import com.dmch.hf.combinedPatterns.Quackable;
import com.dmch.hf.combinedPatterns.decorator.QuackCounter;
import com.dmch.hf.combinedPatterns.ducksImpl.DuckCall;
import com.dmch.hf.combinedPatterns.ducksImpl.MallardDuck;
import com.dmch.hf.combinedPatterns.ducksImpl.RedheadDuck;
import com.dmch.hf.combinedPatterns.ducksImpl.RubberDuck;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

}
