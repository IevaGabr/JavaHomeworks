package io.codelex.oop.persons;

import java.time.LocalDate;

public class Exercise2App {
    public static void main(String[] args) {
        LocalDate emp1StartWork = LocalDate.of(2017, 9, 15);
        Employee emp1 = new Employee("John", "Brown", "325987-88795", 34, "Accountant", emp1StartWork);
        System.out.println(emp1.getInfo());
        Customer customer1 = new Customer("Peter", "Brown", "328974-25898", 28, "CID1234", 9);
        customer1.setPurchaseCount(10);
        System.out.println(customer1.getInfo());
    }
}
