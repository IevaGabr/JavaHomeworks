package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        //todo
        balance = balance + amount;
    }

    public final void withdraw(double amount) {
        //todo
        balance = balance - amount;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return name + ", -$" + String.format("%.2f", balance);
        } else {
            return name + ", $" + String.format("%.2f", balance);
        }
    }
}
