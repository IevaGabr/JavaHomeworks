package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class CardApp {
    public static void main(String[] args) throws NotEnoughFundsException {
        Card debit = new DebitCard("54129874159632114", "John Smith", "015");
        Card credit = new CreditCard("54129879159662134", "Sara Smith", "117");
        /*debit.takeMoney(new BigDecimal("600.00"));
        credit.takeMoney(new BigDecimal("600.00"));*/
        debit.addMoney(new BigDecimal("15000.00"));
        credit.takeMoney(new BigDecimal("400.00"));
        debit.takeMoney(new BigDecimal("12000.00"));
        credit.addMoney(new BigDecimal("600.00"));
        System.out.println(debit);
        System.out.println(credit);

    }
}
