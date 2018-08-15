package com.dmch.hf.iterator;

import com.dmch.hf.iterator.menu.DinnerMenu;
import com.dmch.hf.iterator.menu.PancakeHouseMenu;
import com.dmch.hf.iterator.menuIterators.DinnerMenuIterator;
import com.dmch.hf.iterator.menuIterators.PancakeHouseMenuIterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Iterator dinnerMenuIterator = new DinnerMenuIterator(dinnerMenu.getMenuItems());
        Iterator pancakeHouseMenuIterator = new PancakeHouseMenuIterator(pancakeHouseMenu.getMenuItems());

        printMenu(Arrays.asList(dinnerMenuIterator, pancakeHouseMenuIterator));
    }

    private static void printMenu(List<Iterator> iterators) {
        iterators.get(0).remove();
        iterators.get(1).remove();
        for (Iterator iterator : iterators) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
//        MenuItem{name='Vegetarian Salad', vegeterian=true, price=2.99}
//        MenuItem{name='Bacon with lettuce and tomato', vegeterian=false, price=3.49}
//        MenuItem{name='Hot dog', vegeterian=false, price=2.49}
//        MenuItem{name='Pancake breakfast with eggs', vegeterian=false, price=3.19}
//        MenuItem{name='Blueberry pancakes', vegeterian=true, price=3.49}

    }
}
