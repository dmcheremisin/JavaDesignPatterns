package com.dmch.hf.state.states;

import com.dmch.hf.state.GumballMachine;
import com.dmch.hf.state.State;

/**
 * Created by Dmitrii on 16.08.2018.
 */
public class HasQuarterState implements State {
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert two quarters");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You ejected your quarter. Here it is");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You have turned crank, wait a second");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
