package com.artofcoding.example;

public class ChatRoom implements ChatMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "] : " + message);
    }
}
