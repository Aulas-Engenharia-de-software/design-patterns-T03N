package com.example.nosingleton;

public class Notification {
    private String message;
    private long timestamp;

    public Notification(String message) {
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Notification [message=" + message + ", timestamp=" + timestamp + "]";
    }
}

