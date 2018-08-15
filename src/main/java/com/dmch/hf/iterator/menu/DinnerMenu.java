package com.dmch.hf.iterator.menu;

import java.math.BigDecimal;

public class DinnerMenu {
    static final int MAX_ITEMS = 4;
    int numberOfItems = 0;
    MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    public DinnerMenu() {
        addMenuItem("Soup of the day", false, new BigDecimal("3.09"));
        addMenuItem("Vegetarian Salad", true, new BigDecimal("2.99"));
        addMenuItem("Bacon with lettuce and tomato", false, new BigDecimal("3.49"));
        addMenuItem("Hot dog", false, new BigDecimal("2.49"));
    }

    public void addMenuItem(String name, boolean vegeterian, BigDecimal price) {
        if(numberOfItems >= MAX_ITEMS){
            throw new IllegalStateException("Menu is full of items");
        }
        MenuItem item = new MenuItem(name, vegeterian, price);
        menuItems[numberOfItems++] = item;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
