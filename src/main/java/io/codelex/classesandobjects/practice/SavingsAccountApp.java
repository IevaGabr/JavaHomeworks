package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccountApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money is in the account?");
        double startBalance = input.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(startBalance);
        System.out.println("Enter the annual interest rate?");
        double rate = input.nextDouble();
        rate = rate / 100;
        System.out.println("How long has the account been opened?");
        int month = input.nextInt();
        double deposite = 0;
        double withdrawn = 0;
        double interest;
        for (int i = 1; i <= month; i++) {
            System.out.println("Enter amount deposited for month: " + i + ":");
            double add = input.nextDouble();
            savingsAccount.addDepositToAccount(add);
            deposite += add;
            System.out.println("Enter amount withdrawn for month: " + i + ":");
            double take = input.nextDouble();
            savingsAccount.withdrawalFromAccount(take);
            withdrawn += take;
            savingsAccount.addMonthlyInterestToAccount(rate);
        }
        interest = savingsAccount.getStartBalance() - startBalance - deposite + withdrawn;
        System.out.println("Total deposited: $" + String.format("%.2f", deposite));
        System.out.println("Total withdrawn: $" + String.format("%.2f", withdrawn));
        System.out.println("Interest earned: $" + String.format("%.2f", interest));
        System.out.println("Ending balance: $" + String.format("%.2f", savingsAccount.getStartBalance()));
    }
}
