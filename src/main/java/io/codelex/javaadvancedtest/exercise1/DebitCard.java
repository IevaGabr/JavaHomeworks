package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(String number, String owner, String codeCCV) {
        super(number, owner, codeCCV);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        balance = this.balance.add(amount);
        if (balance.compareTo(new BigDecimal("10000.00")) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {
        if (this.balance.subtract(amount).compareTo(BigDecimal.ZERO) == -1) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
        balance = this.balance.subtract(amount);

    }

    @Override
    public String toString() {
        return super.toString() + " card balance: " + balance.toString() + "EUR";
    }
}
