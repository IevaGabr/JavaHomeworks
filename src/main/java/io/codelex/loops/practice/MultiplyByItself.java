package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (i = 1; i <= n; i++) {
            int result = 1;
            for (int j = 1; j <= n; j++) {
                result *= i;
            }
            System.out.println(i + " to the power " + n + " is " + result);
        }

    }

}
