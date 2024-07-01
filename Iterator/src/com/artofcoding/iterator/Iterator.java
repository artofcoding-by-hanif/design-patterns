package com.artofcoding.iterator;

public interface Iterator<T> {
    void next();
    boolean hasNext();
    T current();
}
