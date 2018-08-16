package com.dmch.hf.state;

import com.dmch.hf.state.states.HasQuarterState;
import com.dmch.hf.state.states.NoQuarterState;
import com.dmch.hf.state.states.SoldOutState;
import com.dmch.hf.state.states.SoldState;

/**
 * Created by Dmitrii on 16.08.2018.
 */
public class GumballMachine {
    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;

    private State state;
    int ballCount = 3;

    public GumballMachine() {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        this.state = noQuarterState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out of the slot");
        if( ballCount != 0){
            ballCount--;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getBallCount() {
        return ballCount;
    }
}
