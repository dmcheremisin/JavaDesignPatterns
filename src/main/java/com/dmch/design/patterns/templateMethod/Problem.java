package com.dmch.design.patterns.templateMethod;


public class Problem {
    public static void main(String[] args) {
        new First().printValues();
        System.out.println();
        new Second().printValues();
        // 1235
        // 143
    }
}

class First {
    void printValues(){
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("5");
    }
}
// copy-paste
class Second {
    void printValues(){
        System.out.print("1");
        System.out.print("4");
        System.out.print("3");
    }
}