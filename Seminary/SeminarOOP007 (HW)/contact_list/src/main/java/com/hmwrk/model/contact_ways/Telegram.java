package com.hmwrk.model.contact_ways;

public class Telegram implements Contact {

    private String name;

    public Telegram(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telegram name: " + name;
    }

    @Override
    public String getName() {
        return name;
    }
}
