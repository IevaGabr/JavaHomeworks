package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");
        System.out.println(max);
        max.setMother(lady.getName());
        max.setFather(rocky.getName());
        System.out.println(max.getName() + " has " + max.getMother() + " as mother, and " + max.getFather() + " as father");
        coco.setMother(molly.getName());
        coco.setFather(buster.getName());
        rocky.setMother(max.getMother());
        rocky.setFather(sam.getName());
        buster.setMother(lady.getName());
        buster.setFather(sparky.getName());
        System.out.println(coco.fathersName());
        System.out.println(sparky.fathersName());
        System.out.println(coco.hasSameMotherAs(rocky));


    }
}
