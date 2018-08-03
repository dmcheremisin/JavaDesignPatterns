package com.dmch.solid;

public class SingleResposibility {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();
        facade.getSalary(); //Got salary 3500$
        facade.cook(); //Cooking seafood
        facade.clean(); //Clean ceiling
    }
}

/**
 * This class symbolizing bad practice, because it has several reasons to change in case something happens.
 * For example, his salary will be changed, he will cook seafood, he will clean ceiling.
 */
class Employee{
    void getSalary(){
        System.out.println("Got salary 3000$");
    }
    void cook(){
        System.out.println("Cooking food");
    }
    void clean(){
        System.out.println("Cleaning floor");
    }
}

/**
 * This class presents right approach to single responsibility principle.
 * It accumulates different classes that have only one reason to change.
 */
class EmployeeFacade implements Salary{
    Cooker cooker = new Cooker();
    Cleaner cleaner = new Cleaner();
    public void getSalary() {
        System.out.println("Got salary 3500$");
    }
    void cook(){
        cooker.cook();
    }
    void clean(){
        cleaner.clean();
    }
}

interface Salary{
    void getSalary();
}
class Cooker {
    void cook(){
        System.out.println("Cooking seafood");
    }
}
class Cleaner {
    void clean(){
        System.out.println("Clean ceiling");
    }
}
