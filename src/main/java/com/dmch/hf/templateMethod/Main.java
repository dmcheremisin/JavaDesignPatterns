package com.dmch.hf.templateMethod;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

//        Boiling water
//        Steeping the tea
//        Pouring in cup
//        Adding lemon
//
//        Boiling water
//        Dripping Coffee through filter
//        Pouring in cup
//        Adding sugar and milk
//        Adding candy
    }
}

abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        addingCompliments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring in cup");
    }
    protected void addingCompliments() {}
}

class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void addingCompliments() {
        System.out.println("Adding candy");
    }
}
