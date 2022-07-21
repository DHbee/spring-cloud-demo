package com.dharbor.test.springclouddemo;

public class AuthenticationValidationException extends RuntimeException {
    public AuthenticationValidationException(String msg, Throwable t){
        super(msg, t);
    }

    public AuthenticationValidationException(String msg){
        super(msg);
    }
}
