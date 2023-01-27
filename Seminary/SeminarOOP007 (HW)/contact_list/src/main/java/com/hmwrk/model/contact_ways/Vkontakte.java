package com.hmwrk.model.contact_ways;

public class Vkontakte implements Contact{
    
    private String name;

    public Vkontakte(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VK: " + name;
    }

    @Override
    public String getName() {
        return name;
    }
}
