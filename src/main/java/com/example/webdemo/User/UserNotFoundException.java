package com.example.webdemo.User;

public class UserNotFoundException extends Throwable{
    public UserNotFoundException(String message) {
        super(message);
    }
}
