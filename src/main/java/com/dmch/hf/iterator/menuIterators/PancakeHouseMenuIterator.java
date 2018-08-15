package com.dmch.hf.iterator.menuIterators;

import com.dmch.hf.iterator.Iterator;
import com.dmch.hf.iterator.menu.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() {
        if(position >= menuItems.size()) {
            throw new IllegalStateException("Element index is out of bounds");
        }
        for(int i = position; i < menuItems.size() - 1; i++) {
            menuItems.set(i, menuItems.get(i+1));
        }
        menuItems.set(menuItems.size() - 1, null);
    }
}
