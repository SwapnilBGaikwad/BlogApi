package com.thoughtworks.model;

public class Greeter {
    private String message;
    private int id;

    public Greeter( String message ) {
        this.message = message;
        this.id = message.length();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage( String message ) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    @Override public String toString() {
        return message;
    }
}
