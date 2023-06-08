package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double sale;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        sale += totalSales;
    }

    public double pay() {
        double payment = super.pay() + sale * commissionRate;
        sale = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + sale;
        return result;
    }
}
