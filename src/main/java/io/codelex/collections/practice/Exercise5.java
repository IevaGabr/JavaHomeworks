package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = input.nextLine();
        List<String> numbList = new ArrayList<>(Arrays.asList(number.split("")));
        int sum = 15;
        while (sum != 1) {
            sum = 0;
            for (int i = 0; i < numbList.size(); i++) {
                sum += Math.pow(Integer.parseInt(numbList.get(i)), 2);
            }
            if (sum == Integer.parseInt(number)) {
                break;
            }
            numbList = Arrays.asList(Integer.toString(sum).split(""));
        }
        if (sum == 1) {
            System.out.println(number + " is happy.");
        } else {
            System.out.println(number + " is not happy");
        }
    }
}
