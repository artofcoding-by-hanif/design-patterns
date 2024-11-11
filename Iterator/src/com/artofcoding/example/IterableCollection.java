package com.artofcoding.example;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
