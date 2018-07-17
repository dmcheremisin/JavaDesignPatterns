package com.dmch.design.patterns.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Dmitrii on 17.07.2018.
 */
public class FlyweightApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        ShapeFactory factory = new ShapeFactory();
        shapes.add(factory.getShape("point"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("square"));
        shapes.add(factory.getShape("point"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("square"));

        Random random = new Random();
        shapes.forEach(shape -> shape.draw(random.nextInt(100), random.nextInt(100)));
        //Point [46, 5, color=black]
        //Circle[22, 57, color=yellow, radius=5]
        //Square[39, 97, color=green, side=10]
        //Point [85, 1, color=black]
        //Circle[12, 62, color=yellow, radius=5]
        //Square[1, 89, color=green, side=10]

    }
}
//Flyweight
interface Shape{
    void draw(int x, int y);
}
//Flyweight Point
class Point implements Shape{
    String color = "black";
    public void draw(int x, int y) {
        System.out.println("Point [" + x + ", " + y + ", color=" + color + "]");
    }
}
//Flyweight Circle
class Circle implements Shape{
    int r = 5;
    String color = "yellow";
    public void draw(int x, int y) {
        System.out.println("Circle[" + x + ", " + y + ", color=" + color + ", radius=" + r + "]");
    }
}
//Flyweight Square
class Square implements Shape{
    int side = 10;
    String color = "green";
    public void draw(int x, int y) {
        System.out.println("Square[" + x + ", " + y + ", color=" + color + ", side=" + side + "]");
    }
}
//Flyweight Factory
class ShapeFactory {
    Map<String, Shape> shapes = new HashMap<>();
    Shape getShape(String name){
        return shapes.computeIfAbsent(name, figure -> {
            switch(figure){
                case "point":
                    return new Point();
                case "circle":
                    return new Circle();
                case "square":
                    return new Square();
            }
            return null;
        });
    }
}