package com.shop.mvc.exceptions;

public class PasswordErrorException extends RuntimeException {

    public PasswordErrorException(String message) {
        super(message);
    }
}
