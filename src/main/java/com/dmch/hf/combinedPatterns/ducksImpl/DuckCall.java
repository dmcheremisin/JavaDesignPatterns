package com.dmch.hf.combinedPatterns.ducksImpl;

import com.dmch.hf.combinedPatterns.Quackable;

/**
 * Created by Dmitrii on 18.08.2018.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
