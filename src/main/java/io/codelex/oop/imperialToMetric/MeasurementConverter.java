package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public static double convertMeasurement(int value, ConversionType conversionType) {
        return (double) value * conversionType.getConstant();
    }
}
