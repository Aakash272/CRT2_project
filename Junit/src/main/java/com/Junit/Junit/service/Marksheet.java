package com.Junit.Junit.service;

public class Marksheet {

    // dependency
    private Student student;

    // Constructor-based Dependency Injection
    public Marksheet(Student student) {
        this.student = student;
    }

    // method to decide the result
    public String generateResult() {
        int marks = student.getMarks();
        String name = student.getName();

        if (marks >= 40) {
            return name + " is PASS";
        } else {
            return name + " is FAIL";
        }
    }
}
