package com.dmch.design.patterns.iterator;

/**
 * Created by Dmitrii on 17.07.2018.
 */
public class IteratorApp {
    public static void main(String[] args) {
        Integer[] values = {1,4,6,9,12};
        IterableCollection<Integer> integerCollection = new MyList<>(values);
        Iterator<Integer> iterator = integerCollection.getIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
        String strs[] = {"first", "second", "third"};
        IterableCollection<String> iterableStrings = new MyList<>(strs);
        Iterator<String> stringsIterator = iterableStrings.getIterator();
        while (stringsIterator.hasNext()){
            System.out.print(stringsIterator.next() + " ");
        }
        // 146912
        // first second third
    }
}

interface Iterator<E> {
    boolean hasNext();
    E next();
}

interface IterableCollection<E> {
    Iterator<E> getIterator();
}
class MyList<E> implements IterableCollection<E> {
    E array[];

    public MyList(E[] array) {
        this.array = array;
    }

    public Iterator<E> getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator<E> {
        int index = 0;

        public boolean hasNext(){
            return index < array.length;
        }
        public E next() {
            return array[index++];
        }
    }
}