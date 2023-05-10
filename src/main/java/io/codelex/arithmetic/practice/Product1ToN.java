package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int factorial = 1;
        int N = 10;
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
