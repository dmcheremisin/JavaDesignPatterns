package com.dmch.solid;

public class InterfaceSegregationBad {
    public static void main(String[] args) {
        new Cook().goTowork(); // Goes to work
        new Waiter().cookFood(); // Exception in thread "main" java.lang.UnsupportedOperationException: Method not implemented
    }
}
interface Worker{
    void goTowork();
    void cookFood();
}
class Cook implements Worker{
    public void goTowork() {
        System.out.println("Goes to work");
    }
    public void cookFood() {
        System.out.println("Cookes food");
    }
}

/**
 * This example violates interface segregation principle, because Waiter should not implement method cookFood().
 * Waiter should implement only methods that belong to waiter.
 * So, the problem is that Worker interface is very wide and it should be split by more specific interfaces.
 */
class Waiter implements Worker{
    public void goTowork() {
        System.out.println("WaiterWorker goes to work");
    }
    public void cookFood() {
        throw new UnsupportedOperationException("Method not implemented");
    }
}