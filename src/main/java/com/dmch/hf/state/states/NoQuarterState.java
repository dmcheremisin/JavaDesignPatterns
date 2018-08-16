package com.dmch.hf.state.states;

import com.dmch.hf.state.GumballMachine;
import com.dmch.hf.state.State;

/**
 * Created by Dmitrii on 16.08.2018.
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You tried to eject, but you haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You tried to dispense, but you have to pay first");
    }
}
