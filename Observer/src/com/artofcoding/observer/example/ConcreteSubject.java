package com.artofcoding.observer.example;

public class ConcreteSubject extends Subject {
    public String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(state);
    }
}
