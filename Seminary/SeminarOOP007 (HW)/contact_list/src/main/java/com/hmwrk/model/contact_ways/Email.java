package com.hmwrk.model.contact_ways;

public class Email implements Contact {

    private String name;

    public Email(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Email: " + name;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
