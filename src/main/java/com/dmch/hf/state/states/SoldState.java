package com.dmch.hf.state.states;

import com.dmch.hf.state.GumballMachine;
import com.dmch.hf.state.State;

/**
 * Created by Dmitrii on 16.08.2018.
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter before you receive your gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject your quarter, gumball is coming");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have already turned crank");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getBallCount() > 0 ) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Machine is out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
