package com.dmch.solid;


import static com.dmch.solid.DependencyInversion.getDataAccess;

public class DependencyInversion {
    public static void main(String[] args) {
        new ClientLayer().doJob();
    }
    public static DAO getDataAccess() {
        //return new JsonData(); // some json data
        return new XmlData(); // some xml data
    }
}

interface DAO {
    void execute();
}
class JsonData implements DAO{
    public void execute(){
        System.out.println("some json data");
    }
}
class XmlData implements DAO{
    public void execute(){
        System.out.println("some xml data");
    }
}

/**
 * Client layer knows only about interface. It is not connected any way with concrete realizations.
 * This way it is possible to provide to Client any instance of class that implement DAO interface.
 * It may be JsonData, or XmlData, or any other class that implements DAO.
 */
class ClientLayer {
    private DAO dataAccess =  getDataAccess();
    void doJob() {
        dataAccess.execute();
    }
}

