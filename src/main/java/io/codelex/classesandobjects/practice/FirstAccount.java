package io.codelex.classesandobjects.practice;

public class FirstAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account("Ieva", 100.0);
        firstAccount.deposit(20.0);
        System.out.println(firstAccount);
    }
}
