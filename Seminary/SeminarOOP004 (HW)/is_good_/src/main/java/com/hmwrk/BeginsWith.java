package com.hmwrk;

public class BeginsWith implements IsGood<String> {

    private String str;

    public BeginsWith(String str) {
        this.str = str;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(str);
    }
}
