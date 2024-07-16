package com.example.ForumHub.domain.exceptions;

public class TopicoCantBeDelete extends RuntimeException{
    public TopicoCantBeDelete(String message) {
        super(message);
    }
}
