package com.hmwrk.model.contact_ways;

public class Phone implements Contact {

    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Телефон: " + name;
    }

    @Override
    public String getName() {
        return name;
    }

}
