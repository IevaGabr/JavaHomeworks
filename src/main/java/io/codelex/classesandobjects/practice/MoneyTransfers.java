package io.codelex.classesandobjects.practice;

public class MoneyTransfers {
    public static void main(String[] args) {
        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);
        Account.transfer(A, B, 50.0);
        Account.transfer(B, C, 25);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
