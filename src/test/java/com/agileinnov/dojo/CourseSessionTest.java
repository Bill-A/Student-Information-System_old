package com.agileinnov.dojo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CourseSessionTest {
    @Test
    public void canCreate() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumner());
    }
}
