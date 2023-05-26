package io.codelex.oop.computers;

public class ComputerApp {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i7", "32GB", "Geforce RTX", "Lenovo", "IdeaCentre Gaming5");
        Computer pc2 = new Computer("i5", "16GB", "Geforce RTX", "HP", "Compaq 8100 Elite");
        System.out.println(pc1.getCompany());
        System.out.println(pc2.getGraphicsCard());
        System.out.println(pc1.equals(pc2));
        System.out.println(pc2.hashCode());
    }
}
