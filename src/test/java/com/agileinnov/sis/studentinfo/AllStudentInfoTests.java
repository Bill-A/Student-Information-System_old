package com.agileinnov.sis.studentinfo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        StudentTest.class,
        CourseSessionTest.class,
        DateUtilTest.class
})

public class AllStudentInfoTests {}


