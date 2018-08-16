package com.dmch.hf.state;

/**
 * Created by Dmitrii on 17.08.2018.
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println(" --------------------- ");
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println(" --------------------- ");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(" --------------------- ");
        gumballMachine.turnCrank();
        System.out.println(" --------------------- ");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(" --------------------- ");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(" --------------------- ");

//        You inserted a quarter
//        You have turned crank, wait a second
//        A gumball comes rolling out of the slot
//        You tried to eject, but you haven 't inserted a quarter
//        ---------------------
//        You inserted a quarter
//        You ejected your quarter.Here it is
//        You turned, but there is no quarter
//        You tried to dispense, but you have to pay first
//        ---------------------
//        You inserted a quarter
//        You can 't insert two quarters
//        You ejected your quarter.Here it is
//        You inserted a quarter
//        You have turned crank, wait a second
//        A gumball comes rolling out of the slot
//        ---------------------
//        You turned, but there is no quarter
//        You tried to dispense, but you have to pay first
//        ---------------------
//        You inserted a quarter
//        You have turned crank, wait a second
//        A gumball comes rolling out of the slot
//        Machine is out of gumballs
//        ---------------------
//        Sorry, all balls are sold
//        Turning crank will not help
//        No balls in the machine
//        ---------------------
    }
}
