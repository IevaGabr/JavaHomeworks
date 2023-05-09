package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        if (radius.equals(radius.abs())) {
            return Math.PI * Math.pow(radius.doubleValue(), 2);
        } else {
            System.out.println("Radius must be positive!");
        }
        throw new NoCodeWrittenException();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        if (length.equals(length.abs()) && width.equals(width.abs())) {
            return length.multiply(width).doubleValue();
        } else {
            System.out.println("Length and width must be positive!");
        }
        throw new NoCodeWrittenException();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        if (base.equals(base.abs()) && h.equals(h.abs())) {
            return base.multiply(h).doubleValue() * 0.5;
        } else {
            System.out.println("Base and h must be positive!");
        }
        throw new NoCodeWrittenException();
    }
}
