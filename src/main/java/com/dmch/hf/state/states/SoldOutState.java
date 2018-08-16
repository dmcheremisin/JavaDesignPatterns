package com.dmch.hf.state.states;

import com.dmch.hf.state.GumballMachine;
import com.dmch.hf.state.State;

/**
 * Created by Dmitrii on 16.08.2018.
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, all balls are sold");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can eject your quarter, if you entered it");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank will not help");
    }

    @Override
    public void dispense() {
        System.out.println("No balls in the machine");
    }
}
