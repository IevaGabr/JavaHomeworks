package io.codelex.oop.summary;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    private static final String name = "Item packing";
    private static final BigDecimal price = new BigDecimal("5.00");

    @Override
    public String returnName() {
        return name;
    }

    @Override
    public BigDecimal returnPrice() {
        return price;
    }

    @Override
    public String fullInfo() {
        return name + ", " + price + " EUR";
    }
}
