package io.codelex.classesandobjects.practice;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMother() {
        return mother;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getFather() {
        return father;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father;
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother.equals(otherDog.getMother())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + ", " + sex;
    }
}
