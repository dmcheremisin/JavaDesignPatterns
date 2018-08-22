package com.dmch.hf.combinedPatterns.duckFactory;

import com.dmch.hf.combinedPatterns.Quackable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createDuckCall();

}
