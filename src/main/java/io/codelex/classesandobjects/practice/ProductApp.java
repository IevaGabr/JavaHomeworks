package io.codelex.classesandobjects.practice;

public class ProductApp {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product printer = new Product("Epson EB-U05", 440.46, 1);
        mouse.printProduct();
        phone.printProduct();
        printer.printProduct();
        mouse.setPrice(65.99);
        mouse.printProduct();
        phone.setAmount(1);
        phone.printProduct();
    }
}
