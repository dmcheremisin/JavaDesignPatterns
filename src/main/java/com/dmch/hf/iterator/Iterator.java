package com.dmch.hf.iterator;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
}
