package com.example.ForumHub.domain.exceptions;

public class UsuarioCantBeDelete extends RuntimeException{
    public UsuarioCantBeDelete(String message) {
        super(message);
    }
}
