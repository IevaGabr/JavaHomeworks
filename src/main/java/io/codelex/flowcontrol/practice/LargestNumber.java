package io.codelex.flowcontrol.practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */

        int largestNumber = 0;

        if (num1 > num2 && num1 > num3) {
            largestNumber = num1;
        }

        if (num2 > num1 && num2 > num3) {
            largestNumber = num2;
        }

        if (num3 > num1 && num3 > num2) {
            largestNumber = num3;
        }

        System.out.println("Largest of numbers: " + num1 + ", " + num2 + " and " + num3 + " is " + largestNumber + ".");
    }

}
