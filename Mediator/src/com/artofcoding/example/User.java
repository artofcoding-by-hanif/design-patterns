package com.artofcoding.example;

// Colleague
public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage(String message);
}
