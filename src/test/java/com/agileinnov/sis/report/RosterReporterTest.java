package com.agileinnov.sis.report;

import com.agileinnov.sis.studentinfo.CourseSession;
import com.agileinnov.sis.studentinfo.DateUtil;
import com.agileinnov.sis.studentinfo.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RosterReporterTest {
    @Test
    public void canReportRoster() {
        CourseSession session = new CourseSession("ENGL", "101", DateUtil.createDate(2003,1,6));

        session.enroll(new Student("Simone Allen"));
        session.enroll(new Student("Semira Allen"));

        String rosterReport = new RosterReporter(session).getReport();
        assertEquals(RosterReporter.ROSTER_REPORT_HEADER +
                        "Simone Allen" + RosterReporter.NEWLINE +
                        "Semira Allen" + RosterReporter.NEWLINE +
                        RosterReporter.ROSTER_REPORT_FOOTER + "2" +
                        RosterReporter.NEWLINE,
                rosterReport);
    }

}
