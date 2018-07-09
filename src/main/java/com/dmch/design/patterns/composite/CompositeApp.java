package com.dmch.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {
    public static void main(String[] args) {
        Composite main = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        main.addComponent(new Square());
        main.addComponent(new Square());
        main.addComponent(new Square());

        composite1.addComponent(new Triangle());
        composite1.addComponent(new Triangle());

        composite2.addComponent(new Circle());
        composite2.addComponent(new Circle());
        composite2.addComponent(new Circle());

        main.addComponent(composite1);
        composite1.addComponent(composite2);

        main.draw();
        /*
        Square
        Square
        Square
        Triangle
        Triangle
        Circle
        Circle
        Circle
         */
    }
}
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Circle");
    }
}
class Triangle implements Drawable {
    public void draw() {
        System.out.println("Triangle");
    }
}
class Square implements Drawable {
    public void draw() {
        System.out.println("Square");
    }
}

class Composite implements Drawable {
    private List<Drawable> components = new ArrayList<>();

    public void addComponent(Drawable drawable){
        components.add(drawable);
    }
    public void removeComponent(Drawable drawable){
        components.remove(drawable);
    }

    public void draw() {
        components.forEach(drawable -> drawable.draw());
    }
}
