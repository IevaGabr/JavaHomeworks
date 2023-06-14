package io.codelex.javaadvancedtest.exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private String number;
    private String owner;
    private String codeCCV;

    public Card(String number, String owner, String codeCCV) {
        this.number = number;
        this.owner = owner;
        this.codeCCV = codeCCV;
    }

    public abstract void addMoney(BigDecimal amount);

    public abstract void takeMoney(BigDecimal amount) throws NotEnoughFundsException;

    @Override
    public String toString() {
        return owner;
    }
}
