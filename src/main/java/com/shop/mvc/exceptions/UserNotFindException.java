package com.shop.mvc.exceptions;

public class UserNotFindException extends RuntimeException {

    public UserNotFindException(String message) {
        super(message);
    }
}
