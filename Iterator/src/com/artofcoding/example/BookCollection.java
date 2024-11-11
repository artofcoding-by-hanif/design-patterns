package com.artofcoding.example;

public class BookCollection implements IterableCollection<Book>{
    private Book[] books;
    private int size = 0;

    public BookCollection(int maxSize) {
        books = new Book[maxSize];
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        }
    }

    public Book getBookAt(int index) {
        if (index >= 0 && index < size) {
            return books[index];
        }
        return null;
    }

    public int getLength() {
        return size;
    }


    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(this);
    }
}
