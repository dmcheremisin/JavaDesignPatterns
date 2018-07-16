package com.dmch.design.patterns.templateMethod;

public class TemplateMethodApp {
    public static void main(String[] args) {
        new A().printValues();
        System.out.println();
        new B().printValues();
        // 1235
        // 143
    }
}
abstract class Template{
    public final void printValues(){
        System.out.print("1");
        differ1();
        System.out.print("3");
        differ2();
    }
    abstract void differ1();
    abstract void differ2();
}
class A extends Template{
    void differ1() {
        System.out.print("2");
    }
    void differ2() {
        System.out.print("5");
    }
}
class B extends Template{
    void differ1() {
        System.out.print("4");
    }
    void differ2() {}
}