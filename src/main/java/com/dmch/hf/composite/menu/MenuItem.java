package com.dmch.hf.composite.menu;

import com.dmch.hf.composite.MenuComponent;
import java.math.BigDecimal;

public class MenuItem extends MenuComponent {
    private String name;
    private boolean vegeterian;
    private BigDecimal price;

    public MenuItem(String name, boolean vegeterian, BigDecimal price) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(name);
        System.out.print(", is vegetarian: " + vegeterian);
        System.out.print(", price: " + price);
        System.out.println();
    }
}