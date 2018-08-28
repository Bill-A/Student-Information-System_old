import com.agileinnov.sis.report.AllReportTests;
import com.agileinnov.sis.studentinfo.AllStudentInfoTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AllStudentInfoTests.class,
        AllReportTests.class
})

public class AllTests {}
