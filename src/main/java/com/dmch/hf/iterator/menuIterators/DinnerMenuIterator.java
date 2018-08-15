package com.dmch.hf.iterator.menuIterators;

import com.dmch.hf.iterator.Iterator;
import com.dmch.hf.iterator.menu.MenuItem;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position++];
        return menuItem;
    }

    @Override
    public void remove() {
        if(position >= menuItems.length) {
            throw new IllegalStateException("Element index is out of bounds");
        }
        for(int i = position; i < menuItems.length - 1; i++){
            menuItems[i] = menuItems[i+1];
        }
        menuItems[menuItems.length - 1] = null;
    }
}
