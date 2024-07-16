package com.example.ForumHub.domain.exceptions;

public class CursoNotFoundException extends RuntimeException{
    public CursoNotFoundException(String message) {
        super(message);
    }
}
