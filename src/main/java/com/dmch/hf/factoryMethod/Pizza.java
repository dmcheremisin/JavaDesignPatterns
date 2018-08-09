package com.dmch.hf.factoryMethod;

public class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;

    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough..." + name);
        System.out.println("Adding sauce..." + name);
    }

    protected void bake() {
        System.out.println("Baking for 25 min at 350 degrees");
    }
    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    protected void box() {
        System.out.println("Putting pizza into original PizzaStore box");
    }
}
