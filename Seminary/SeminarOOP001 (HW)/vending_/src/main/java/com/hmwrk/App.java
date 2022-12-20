package com.hmwrk;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        VendingMashine hotDrinksAndSnacks = new VendingMashine();

        hotDrinksAndSnacks.addProduct(1, new HotDrink("Americano", 3.99f, 12, 50, 87));
        hotDrinksAndSnacks.addProduct(2, new HotDrink("Latte", 5.99f, 22, 50, 87));
        hotDrinksAndSnacks.addProduct(3, new HotDrink("Lipton", 2.99f, 30, 50, 97));
        hotDrinksAndSnacks.addProduct(6, new Snack("Cookie", 3.12f, 12, 40, 2));

        int usrInput = 1;
        while (usrInput != 0) {
            hotDrinksAndSnacks.showStoreFront();
            usrInput = hotDrinksAndSnacks.enterNumber();
            hotDrinksAndSnacks.productBuy(usrInput);
        }

    }
}
