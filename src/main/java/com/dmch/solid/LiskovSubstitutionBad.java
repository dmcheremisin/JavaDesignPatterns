package com.dmch.solid;

import java.util.Random;

public class LiskovSubstitutionBad {
    private static Random random = new Random();

    /**
     * Sometimes method returns Rectangle, sometimes Square
     * @return Rectangle base type
     */
    public static Rectangle getRectangle() {
        if( random.nextInt(100) % 2 == 0) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
    /**
     * The behaviour of parent class is changed in child, because we overrided getArea() method
     * But our client expects to see area of rectangle, not square.
     * So, this code violates Liskov Substitution Principle, because inheritance should not bring any special effects
     * to our code.
     *
     * @param args
     */
    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getArea()); // sometimes area is 50, sometimes is 25
    }

    private static class Rectangle {
        protected int width;
        protected int height;

        public void setWidth(int width) {
            this.width = width;
        }
        public void setHeight(int height) {
            this.height = height;
        }
        public int getArea() {
            return width * height;
        }
    }
    private static class Square extends Rectangle {
        public void setWidth(int width) {
            this.width = width;
            this.height = width;
        }
        public void setHeight(int height) {
            this.height = height;
            this.width = height;
        }
        public int getArea() {
            return width * width;
        }
    }
}

