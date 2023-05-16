package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 100) + 1;
        }
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = array1[i];
        }
        array1[array1.length - 1] = -7;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
