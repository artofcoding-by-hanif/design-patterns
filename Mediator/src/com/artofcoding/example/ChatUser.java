package com.artofcoding.example;

// Concrete colleague

public class ChatUser extends User {
    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        chatMediator.showMessage(this, message);
    }
}
