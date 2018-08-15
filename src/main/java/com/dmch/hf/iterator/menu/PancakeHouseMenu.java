package com.dmch.hf.iterator.menu;

import com.dmch.hf.iterator.Iterable;
import com.dmch.hf.iterator.Iterator;
import com.dmch.hf.iterator.menuIterators.PancakeHouseMenuIterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Iterable<MenuItem> {
    List<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {
        addMenuItem("Vegeterian Pancake breakfast", true, new BigDecimal("2.99"));
        addMenuItem("Pancake breakfast with eggs", false, new BigDecimal("3.19"));
        addMenuItem("Blueberry pancakes", true, new BigDecimal("3.49"));
    }

    public void addMenuItem(String name, boolean vegeterian, BigDecimal price) {
        MenuItem item = new MenuItem(name, vegeterian, price);
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
