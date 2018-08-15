package com.dmch.hf.iterator;

public interface Iterable<E> {
    Iterator<E> createIterator();
}
