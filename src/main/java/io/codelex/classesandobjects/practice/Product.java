package io.codelex.classesandobjects.practice;

import java.math.BigDecimal;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + String.format("%.2f", this.price).replace(",", ".")
                + ",  amount " + this.amount);
    }


}
