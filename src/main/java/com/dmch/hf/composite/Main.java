package com.dmch.hf.composite;

import com.dmch.hf.composite.menu.Menu;
import com.dmch.hf.composite.menu.MenuItem;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new Menu("Pancake house menu");
        Menu dinnerMenu = new Menu("Dinner menu");
        Menu desertMenu = new Menu("Desert menu");

        dinnerMenu.add(desertMenu);

        Menu allMenus = new Menu("All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem("Soup of the day", false, new BigDecimal("3.09")));
        dinnerMenu.add(new MenuItem("Vegetarian Salad", true, new BigDecimal("2.99")));
        dinnerMenu.add(new MenuItem("Bacon with lettuce and tomato", false, new BigDecimal("3.49")));
        dinnerMenu.add(new MenuItem("Hot dog", false, new BigDecimal("2.49")));

        pancakeHouseMenu.add(new MenuItem("Vegeterian Pancake breakfast", true, new BigDecimal("2.99")));
        pancakeHouseMenu.add(new MenuItem("Pancake breakfast with eggs", false, new BigDecimal("3.19")));
        pancakeHouseMenu.add(new MenuItem("Blueberry pancakes", true, new BigDecimal("3.49")));

        desertMenu.add(new MenuItem("Apple pie", true, new BigDecimal("1.59")));
        desertMenu.add(new MenuItem("Strawberry pie", true, new BigDecimal("1.59")));

        allMenus.print();

//        All menus combined
//         ----------------------
//        Pancake house menu
//         ----------------------
//        Vegeterian Pancake breakfast, is vegetarian: true, price: 2.99
//        Pancake breakfast with eggs, is vegetarian: false, price: 3.19
//        Blueberry pancakes, is vegetarian: true, price: 3.49
//         ----------------------
//        Dinner menu
//         ----------------------
//        Desert menu
//         ----------------------
//        Apple pie, is vegetarian: true, price: 1.59
//        Strawberry pie, is vegetarian: true, price: 1.59
//         ----------------------
//        Soup of the day, is vegetarian: false, price: 3.09
//        Vegetarian Salad, is vegetarian: true, price: 2.99
//        Bacon with lettuce and tomato, is vegetarian: false, price: 3.49
//        Hot dog, is vegetarian: false, price: 2.49
//         ----------------------
//         ----------------------

    }
}
