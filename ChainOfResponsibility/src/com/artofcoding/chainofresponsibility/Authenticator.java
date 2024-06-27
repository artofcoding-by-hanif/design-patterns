package com.artofcoding.chainofresponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = ((request.getUserName() == "admin") &&
                request.getPassword() == "1234");
        System.out.println("Authenticate");

        return !isValid;
    }
}
