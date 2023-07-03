package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {
    private LocalDate bestBefore;

    public FoodItem(String name, BigDecimal price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + ", best before: " + bestBefore.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
