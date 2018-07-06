package com.dmch.design.patterns.abstractFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        Fabric fabric = getFabricByName("en");
        Mouse mouse = fabric.getMouse();
        Keyboard keyboard = fabric.getKeyboard();

        mouse.click();
        mouse.dblClick();
        keyboard.print();
        keyboard.println();
    }

    public static Fabric getFabricByName(String name) {
        if(name == null || name.length() == 0) throw new IllegalArgumentException();
        switch (name.toLowerCase()) {
            case "ru":
                return new RuFabric();
            case "en":
                return new EnFabric();
            default:
                throw new RuntimeException(String.format("Fabric with %s is not found", name));
        }
    }
}

interface Mouse {
    void click();
    void dblClick();
}
class RuMouse implements Mouse {
    public void click() {
        System.out.println("Нажатие кнопки");
    }
    public void dblClick() {
        System.out.println("Двойное нажатие кнопки");
    }
}
class EnMouse implements Mouse {
    public void click() {
        System.out.println("Click");
    }
    public void dblClick() {
        System.out.println("Double Click");
    }
}

interface Keyboard {
    void print();
    void println();
}
class RuKeyboard implements Keyboard {
    public void print() {
        System.out.println("Печать без переноса строки");
    }
    public void println() {
        System.out.println("Печать с переносом строки");
    }
}

class EnKeyboard implements Keyboard {
    public void print() {
        System.out.println("Print without new line");
    }
    public void println() {
        System.out.println("Print with new line");
    }
}


interface Fabric {
    Mouse getMouse();
    Keyboard getKeyboard();
}
class RuFabric implements Fabric {
    public Mouse getMouse() {
        return new RuMouse();
    }
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }
}
class EnFabric implements Fabric {
    public Mouse getMouse() {
        return new EnMouse();
    }
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }
}
