package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<SellableThing> orderList = new ArrayList<>();

    public void addItemToOrderList(SellableThing sellableThing) throws BadFoodException {
        if (sellableThing instanceof FoodItem) {
            if (((FoodItem) sellableThing).getBestBefore().isBefore(LocalDate.now())) {
                throw new BadFoodException("Expiration date is over!");
            } else {
                orderList.add(sellableThing);
            }
        } else {
            orderList.add(sellableThing);
        }

    }

    public BigDecimal calculatePrice() {
        BigDecimal sum = BigDecimal.ZERO;
        for (SellableThing sellableThing : orderList) {
            sum = sum.add(sellableThing.returnPrice());
        }
        return sum;
    }

    public String showOrderItems() {
        String orderText = "";
        for (int i = 0; i < orderList.size(); i++) {
            if (i == orderList.size() - 1) {
                orderText = orderText + "= " + (i + 1) + ". " + orderList.get(i).fullInfo() + " ".repeat(60 - 6 - orderList.get(i).fullInfo().length()) + "=";
            } else {
                orderText = orderText + "= " + (i + 1) + ". " + orderList.get(i).fullInfo() + " ".repeat(60 - 6 - orderList.get(i).fullInfo().length()) + "=\n";
            }

        }
        return orderText;
    }
}
