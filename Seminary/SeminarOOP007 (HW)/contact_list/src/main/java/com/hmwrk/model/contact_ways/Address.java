package com.hmwrk.model.contact_ways;

public class Address implements Contact {

    private String name;


    public Address(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Адрес: " + name;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
