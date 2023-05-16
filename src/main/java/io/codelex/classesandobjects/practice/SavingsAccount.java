package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    private double startBalance;

    public SavingsAccount(double startBalance) {
        this.startBalance = startBalance;
    }

    public double getStartBalance() {
        return startBalance;
    }

    public void withdrawalFromAccount(double amount) {
        startBalance = startBalance - amount;
    }

    public void addDepositToAccount(double amount) {
        startBalance = startBalance + amount;
    }

    public void addMonthlyInterestToAccount(double rate) {
        startBalance = startBalance + (startBalance * (rate / 12));
    }
}
