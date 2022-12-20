package com.hmwrk;

public class Snack extends Product {
    int weight;
    int piece;

    public Snack(String name, float price, int total, int weight, int piece) {
        super(name, price, total);
        this.weight = weight;
        this.piece = piece;
    }

    public String toString() {
        return ">Название - " + getName() + ",\t Вес: " + weight
                + ",\t В упаковке: " + piece + "шт,\t Цена: " + getPrice()
                + ",\t Доступно: " + getTotal() + " порций";
    }
}
