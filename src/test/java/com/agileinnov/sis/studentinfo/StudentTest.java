package com.agileinnov.sis.studentinfo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void canCreate() {
        final String janeDoe = "Jane Doe";
        Student student_1 = new Student(janeDoe);
        assertEquals("Jane Doe", student_1.getName());

        final String johnDoe = "John Doe";
        Student student_2 = new Student(johnDoe);
        assertEquals("John Doe", student_2.getName());
    }
}
