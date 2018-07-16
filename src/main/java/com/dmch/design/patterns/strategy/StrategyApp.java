package com.dmch.design.patterns.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Dmitrii on 16.07.2018.
 */
public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient<String> client = new StrategyClient<>();
        client.setStrategy(new SortAscendind<>());
        List<String> list = Arrays.asList("5", "2", "4", "3", "1");
        client.executeStrategy(list);
        System.out.println(list); // [1, 2, 3, 4, 5]

        client.setStrategy(new SortDescendind<>());
        client.executeStrategy(list);
        System.out.println(list); // [5, 4, 3, 2, 1]

        StrategyClient<Integer> clientInt = new StrategyClient<>();
        clientInt.setStrategy(new SortAscendind<>());
        List<Integer> nums = Arrays.asList(3, 5, 1, 4, 2, 6);
        clientInt.executeStrategy(nums);
        System.out.println(nums); // [1, 2, 3, 4, 5, 6]
    }
}
class StrategyClient<E extends Comparable> {
    private Strategy<E> strategy;
    public void setStrategy(Strategy<E> strategy) {
        this.strategy = strategy;
    }
    public void executeStrategy(List<E> list){
        strategy.sort(list);
    }
}
interface Strategy<E> {
    void sort(List<E> list);
}
class SortAscendind<E extends Comparable> implements Strategy<E> {
    public void sort(List<E> list) {
        list.sort(Comparator.naturalOrder());
    }
}
class SortDescendind<E extends Comparable> implements Strategy<E> {
    public void sort(List<E> list) {
        list.sort(Comparator.reverseOrder());
    }
}