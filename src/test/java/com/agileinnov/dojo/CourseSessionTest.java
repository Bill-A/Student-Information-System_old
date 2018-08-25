package com.agileinnov.dojo;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class CourseSessionTest {
    private CourseSession session;
    private Date startDate;


    @Before
    public void setUp() {
        startDate = new DateUtil().createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
    }

    @Test
    public void canCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }

    @Test
    public void canEnrollStudents() {

        Student student1 = new Student("Bill Allen");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        Student student2 = new Student("William Allen");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    @Test
    public void canCalculateCourseDates(){
        Date sixteenWeeksOut = new DateUtil().createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

}
