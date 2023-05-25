package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        Exercise2 ex = new Exercise2();
        ex.methodA();
    }

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void methodC() throws ArithmeticException {
        int x = 2;
        int y = 0;
        try {
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
