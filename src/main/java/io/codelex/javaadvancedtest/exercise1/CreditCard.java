package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String number, String owner, String codeCCV, BigDecimal overdraft) {
        super(number, owner, codeCCV);
        this.balance = overdraft;
    }

    @Override
    public void addMoney(BigDecimal amount) {
        balance = this.balance.add(amount);
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (this.balance.subtract(amount).compareTo(BigDecimal.ZERO) == -1) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
        balance = this.balance.subtract(amount);
        if (balance.compareTo(new BigDecimal("100.00")) <= 0) {
            System.out.println("Warning: Low funds");
        }

    }

    @Override
    public String toString() {
        return super.toString() + " card balance: " + balance.toString() + "EUR";
    }
}
