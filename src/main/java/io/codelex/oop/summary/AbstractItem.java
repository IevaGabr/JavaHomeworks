package io.codelex.oop.summary;

import java.math.BigDecimal;

public class AbstractItem implements Item {
    private String name;
    private BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

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
