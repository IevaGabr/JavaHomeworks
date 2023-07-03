package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws BadFoodException, WrongOrderException {
        Item milk = new FoodItem("Milk", new BigDecimal("0.75"), LocalDate.of(2023, 6, 15));
        Item radio = new ElectronicsItem("Radio", new BigDecimal("25.00"), 100);
        Item bucket = new HouseholdItem("Bucket", new BigDecimal("5.00"), "red");
        Service packing = new ItemPacking();
        Order order = new Order();
        order.addItemToOrderList(milk);
        order.addItemToOrderList(radio);
        order.addItemToOrderList(bucket);
        order.addItemToOrderList(packing);
        Invoice invoice = new Invoice(order, "INV123");
        System.out.println(invoice.printInvoice());
    }
}
