package com.agileinnov.dojo;

public class CourseSession {
    private String department;
    private String number;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumner() {
        return number;
    }
}
