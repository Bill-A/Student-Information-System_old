package com.agileinnov.sis.report;

import com.agileinnov.sis.studentinfo.CourseSession;
import com.agileinnov.sis.studentinfo.Student;

public class RosterReporter {
    static final String NEWLINE = System.getProperty("line.separator");
    static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "_____" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";

    private CourseSession session;

    public RosterReporter(CourseSession session) {
        this.session = session;
    }

    public String getReport() {
            StringBuilder buffer = new StringBuilder();

            buffer.append(ROSTER_REPORT_HEADER);

            for (Student student: session.getAllStudents()) {
                buffer.append(student.getName());
                buffer.append(NEWLINE);
            }

            buffer.append(
                    ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEWLINE);

            return buffer.toString();
    }
}
