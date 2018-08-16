package com.dmch.hf.state;

/**
 * Created by Dmitrii on 16.08.2018.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
