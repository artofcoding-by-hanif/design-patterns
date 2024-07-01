package com.artofcoding.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
//    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public Iterator createIterator() {
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public void setUrls(List<String> urls) {
//        this.urls = urls;
//    }

    public void push(String url) {
//        urls.add(url);
        urls[count++] = url;
    }

    public String pop() {
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//        return lastUrl;

        return urls[--count];
    }


//    public class ListIterator implements Iterator {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public void next() {
//            index ++;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public Object current() {
//            return history.urls.get(index);
//        }
//    }

    public  class ArrayIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            index ++;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public Object current() {
            return history.urls[index];
        }
    }
}
