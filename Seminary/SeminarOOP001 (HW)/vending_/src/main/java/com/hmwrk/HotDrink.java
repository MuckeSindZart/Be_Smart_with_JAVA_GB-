package com.hmwrk;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, float price, int total, int volume, int temperature) {
        super(name, price, total);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return ">Напиток - " + getName()
                + ",\t Объем: " + volume + ",\t Температура: " + temperature
                + ",\t Цена: " + getPrice() + ",\t Доступно: " + getTotal() + " порций";
    }

}
