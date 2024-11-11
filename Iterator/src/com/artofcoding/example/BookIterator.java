package com.artofcoding.example;

import java.util.NoSuchElementException;

public class BookIterator implements Iterator {
    private BookCollection collection;
    private int currentIndex = 0;

    public BookIterator(BookCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.getLength();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return collection.getBookAt(currentIndex++);
    }
}
