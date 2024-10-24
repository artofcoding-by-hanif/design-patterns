package com.artofcoding.cor;

public abstract class Handler {

    Handler handler;
    public Handler(Handler handler) {
        this.handler = handler;
    }

    public void handle(String request){

    }
}
