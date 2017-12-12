package com.zaid.hoona.test.heroku;

public class HelloWorld {
    private String message;

    public HelloWorld() {
        this.message = "Hello World!";
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
