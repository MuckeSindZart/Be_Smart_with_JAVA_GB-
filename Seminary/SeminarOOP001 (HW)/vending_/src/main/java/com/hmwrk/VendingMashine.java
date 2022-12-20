package com.hmwrk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMashine {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Integer panelNumber, Product newProduct) {
        products.put(panelNumber, newProduct);
    }

    public void showStoreFront() {
        System.out.println();
        for (HashMap.Entry<Integer, Product> item : products.entrySet()) {
            System.out.println(item.toString());
        }
        System.out.println("\n0=> Для выхода");
    }

    private void giveProduct(Product product) {
        product.setTotal(product.getTotal() - 1);
    }

    public Product getProducts(int panelNumber) {
        return products.get(panelNumber);
    }

    private Scanner scanner = new Scanner(System.in);

    public int enterNumber() {
        System.out.println();
        System.out.print("Выберете слот ~> ");
        int panelNumber = scanner.nextInt();
        System.out.println("Вы выбрали слот номер '" + panelNumber
                + "', Цена: " + getProducts(panelNumber).getPrice());
        return panelNumber;
    }

    public void productBuy(int panelNumber) {
        Product product = getProducts(panelNumber);

        System.out.print("Внесите деньги ~> ");
        float deposit = 0f;
        while (true) {
            int cash = scanner.nextInt();
            System.out.printf("Вы внесли %d руб. ", cash);
            deposit += cash;
            if (deposit < product.getPrice()) {
                System.out.printf("Нужно еще %.2f руб.\n", product.getPrice() - deposit);

            } else if (deposit > product.getPrice()) {
                System.out.printf("Ваша сдача %.2f руб.\n", deposit - product.getPrice());
                System.out.println("Возьмите ваш товар. -> " + product.getName());
                giveProduct(product);
                break;
            } else {
                System.out.println("Возьмите ваш товар. ->" + product.getName());
                giveProduct(product);
                break;
            }
        }
        System.out.println("Спасибо за покупку!!!");
    }

}
