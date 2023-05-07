package io.codelex.typesandvariables.practice;

public class Exercise5 {
    public static void main(String[] args) {
        String[] courses = {"English III", "Precalculus", "Music Theory", "Biotechnology", "Principles of Technology I",
                "Latin II", "AP US History", "Business Computer Information Systems"};
        String[] teachers = {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer", "Ms. Garcia", "Mrs. Barnett",
                "Ms. Johannessen", "Mr. James"};

        int coursesColumnWidth = 38;
        int teachersColumnWidth = 15;

        System.out.println("+" + String.format("%1$62s", "+").replace(" ", "-"));

        for (int i = 0; i < courses.length; i++) {
            System.out.println("| " + (i+1) + " |" + String.format("%1$" + coursesColumnWidth + "s",courses[i]) + " | "
                    + String.format("%1$" + teachersColumnWidth + "s",teachers[i]) + " |");
        }

        System.out.println("+" + String.format("%1$62s", "+").replace(" ", "-"));
    }
}
