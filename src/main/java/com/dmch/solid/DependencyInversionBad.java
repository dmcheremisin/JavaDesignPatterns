package com.dmch.solid;

import static com.dmch.solid.DependencyInversionBad.getDataAccess;

public class DependencyInversionBad {
    public static void main(String[] args) {
        new Client().doJob();
    }
    public static DataAccess getDataAccess() {
        return new DataAccess();
    }
}
class DataAccess {
    public void execute(){
        System.out.println("some data");
    }
}

/**
 * This class structure violates Dependency Inversion Principle, because Client class knows about concrete implementation
 * of DataAccess class, but it shouldn't.
 * In contrast, it should held this class by interface.
 */
class Client {
    private DataAccess dataAccess = getDataAccess();
    void doJob() {
        dataAccess.execute();
    }
}

