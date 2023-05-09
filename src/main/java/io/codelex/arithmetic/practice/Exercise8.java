package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void main(String[] args) {
        double employee1BasePay = 7.50;
        double employee2BasePay = 8.20;
        double employee3BasePay = 10.00;
        int employee1WorkedHours = 35;
        int employee2WorkedHours = 47;
        int employee3WorkedHours = 73;
        calculateSalary(employee1BasePay, employee1WorkedHours);
        calculateSalary(employee2BasePay, employee2WorkedHours);
        calculateSalary(employee3BasePay, employee3WorkedHours);
    }

    public static void calculateSalary (double basePay, int hoursWorked) {
        if (basePay < 8) {
            System.out.println("The base pay must not be less than the minimum wage ($8.00 an hour).");
        } else if (hoursWorked > 60) {
            System.out.println("Worked hours cannot be more than 60.");
        } else {
            if (hoursWorked <= 40){
                double salary = basePay * hoursWorked;
                System.out.println("Total pay: $" + String.format("%.2f", salary).replace(",", "."));
            } else {
                double salary = basePay * 40;
                salary = salary + basePay * 1.5 * (hoursWorked - 40);
                System.out.println("Total pay: $" + String.format("%.2f", salary).replace(",", "."));
            }
        }
    }
}
