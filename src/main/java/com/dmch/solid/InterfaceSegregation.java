package com.dmch.solid;

public class InterfaceSegregation {
    public static void main(String[] args) {
        new CookWorker().cookFood(); // Cookes food
        //new WaiterWorker().cookFood(); no such method
        new WaiterWorker().goTowork(); // Waiter goes to work
    }
}

interface GoToWork{
    void goTowork();
}
interface CookFood{
    void cookFood();
}
interface WorkerCooker extends GoToWork, CookFood {}

class CookWorker implements WorkerCooker{
    public void goTowork() {
        System.out.println("Goes to work");
    }
    public void cookFood() {
        System.out.println("Cookes food");
    }
}

/**
 * Waiter implements only specific, related to waiter responsibilities interface.
 * This time waiter is not obliged to implement unused methods.
 */
class WaiterWorker implements GoToWork{
    public void goTowork() {
        System.out.println("Waiter goes to work");
    }
}