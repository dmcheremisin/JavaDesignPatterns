package com.dmch.hf.combinedPatterns.composite;

import com.dmch.hf.combinedPatterns.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class Flock implements Quackable {
    List<Quackable> quackables = new ArrayList<>();

    public void addQuackable(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable next = iterator.next();
            next.quack();
        }
    }
}
