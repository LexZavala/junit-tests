import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testIfAddStudentWorks() {
        assertEquals(0, testCohort.getStudents().size());
        testCohort.addStudent(student1);
        assertEquals(1, testCohort.getStudents().size());
    }

}
