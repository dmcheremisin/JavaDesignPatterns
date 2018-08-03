package com.dmch.solid;

import java.util.Random;

public class LiskovSubstitution {
    private static Random random = new Random();

    public static Shape getShape() {
        if( random.nextInt(100) % 2 == 0) {
            return new Rectangle(10, 5);
        } else {
            return new Square(25);
        }
    }

    /**
     * We do not override behavior of parent class, because we implement interface now Shape.
     * Shape has method getArea(), so it can return any value without expectancy of Rectangle area or Square area.
     * @param args
     */
    public static void main(String[] args) {
        Shape rectangle = getShape();
        System.out.println(rectangle.getArea()); // sometimes area is 50, sometimes is 25
    }

}
interface Shape{
    int getArea();
}
class Rectangle implements Shape{
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
}
class Square implements Shape {
    private int width;

    public Square(int width) {
        this.width = width;
    }
    public int getArea() {
        return width * width;
    }
}
