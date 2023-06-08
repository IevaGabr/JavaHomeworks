package io.codelex.polymorphism.practice.exercise3;

public class Exercise3App {
    public static void main(String[] args) {
        Student student = new Student(5.09);
        student.setFirstName("Ieva");
        student.setLastName("Gabrane");
        student.setId(159782);
        student.setAddress("Vangazi");
        Employee employee = new Employee("accountant");
        employee.setFirstName("Tabita");
        employee.setLastName("Krumina");
        employee.setId(1598753);
        employee.setAddress("Liepaja");
        student.display();
        employee.display();
    }
}
