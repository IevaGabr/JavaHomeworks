package io.codelex.oop.imperialToMetric;

public class MeasurementConverterTestApp {
    public static void main(String[] args) {
        System.out.println(MeasurementConverter.convertMeasurement(10, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(MeasurementConverter.convertMeasurement(100, ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurementConverter.convertMeasurement(1, ConversionType.YARDS_TO_METERS));
        System.out.println(MeasurementConverter.convertMeasurement(15, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(MeasurementConverter.convertMeasurement(25, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(MeasurementConverter.convertMeasurement(30, ConversionType.MILES_TO_KILOMETERS));
    }
}
