package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void display() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getId() + " address is " + getAddress() + ", job: " + this.jobTitle);
    }
}
