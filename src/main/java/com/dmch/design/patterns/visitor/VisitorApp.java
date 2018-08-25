package com.dmch.design.patterns.visitor;

/**
 * Created by Dmitrii on 16.07.2018.
 */
public class VisitorApp {
    public static void main(String[] args) {
        Museum hermitage = new Hermitage();
        Museum russianMuseum = new RussianMuseum();

        Visitor student = new Student();
        Visitor lector = new Lector();

        hermitage.accept(student); // WOW, Hermitage is amazing!
        hermitage.accept(lector); // Hermitage has one of the largest expositions in the world. It was built....

        russianMuseum.accept(student); // WOW, There are so many pictures
        russianMuseum.accept(lector); // Russian is the largest depository of Russian fine art in Saint Petersburg. It is also....
    }
}
interface Visitor{
    void visit(Hermitage hermitage);
    void visit(RussianMuseum russianMuseum);
}

interface Museum{
    void accept(Visitor visitor);
}
class Hermitage implements Museum {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class RussianMuseum implements Museum {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Student implements Visitor{
    public void visit(Hermitage hermitage) {
        System.out.println("WOW, Hermitage is amazing!");
    }
    public void visit(RussianMuseum russianMuseum) {
        System.out.println("WOW, There are so many pictures");
    }
}
class Lector implements Visitor{
    public void visit(Hermitage hermitage) {
        System.out.println("Hermitage has one of the largest expositions in the world. It was built....");
    }
    public void visit(RussianMuseum russianMuseum) {
        System.out.println("Russian is the largest depository of Russian fine art in Saint Petersburg. It is also.... ");
    }
}
