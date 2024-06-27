package com.artofcoding.chainofresponsibility;

public class HttpRequest {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public HttpRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
