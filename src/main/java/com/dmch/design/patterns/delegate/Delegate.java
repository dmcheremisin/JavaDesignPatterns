package com.dmch.design.patterns.delegate;

public class Delegate {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setDrawable(new Circle()).draw();
        painter.setDrawable(new Triangle()).draw();
        painter.setDrawable(() -> System.out.println("Square")).draw();
        //Circle
        //Triangle
        //Square
    }
}

class Painter {
    private Drawable drawable;
    Painter setDrawable(Drawable d){
        this.drawable = d;
        return this;
    }
    void draw(){
        this.drawable.draw();
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
class Triangle implements Drawable{
    public void draw() {
        System.out.println("Triangle");
    }
}


