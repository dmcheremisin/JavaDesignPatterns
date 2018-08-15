package com.dmch.hf.iterator.menu;

import java.math.BigDecimal;

public class MenuItem {
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
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", price=" + price +
                '}';
    }
}
