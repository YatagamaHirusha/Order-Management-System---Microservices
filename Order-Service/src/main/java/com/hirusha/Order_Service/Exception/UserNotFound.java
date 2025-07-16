package com.hirusha.Order_Service.Exception;

public class UserNotFound extends RuntimeException {
    public UserNotFound(String message) {
                super(message);
    }
    public UserNotFound(){
        super("User not found.");
    }
}
