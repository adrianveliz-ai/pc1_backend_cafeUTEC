package com.example.pc1.exception;

public class ForbiddenStoreActionException extends RuntimeException {
    public ForbiddenStoreActionException(String message) {
        super(message);
    }
}
