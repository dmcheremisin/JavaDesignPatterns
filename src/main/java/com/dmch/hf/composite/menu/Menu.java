package com.dmch.hf.composite.menu;

import com.dmch.hf.composite.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> components = new ArrayList<>();
    String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        components.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        components.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println(" ---------------------- ");

        Iterator<MenuComponent> iterator = components.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            next.print();
        }
        System.out.println(" ---------------------- ");
    }
}
