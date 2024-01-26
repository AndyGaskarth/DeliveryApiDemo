package com.mbalem.demodeliveryapi.exception;

public class UsernameUniqueViolationException extends RuntimeException{
    public UsernameUniqueViolationException(String message) {
        super(message);
    }
}
