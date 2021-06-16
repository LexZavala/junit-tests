import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {


    private static Student testStudent;


    @Before
    public void setUp(){
    testStudent = new Student(2100404, "Lex" );
    }

    @Test
    public void propertiesAreSet() {
        assertNotNull(testStudent.getName());
        assertNotNull(testStudent.getId());
        assertEquals(new ArrayList<>(), testStudent.getGrades());
        // test a null value
        Student nullStudent = null;
        assertNull(nullStudent);
    }

    @Test
    public void testIfGettersWork(){
        assertEquals(2100404, testStudent.getId());
        assertEquals("Lex", testStudent.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertEquals(0, testStudent.getGrades().size());
        testStudent.addGrade(96);
        assertEquals(1, testStudent.getGrades().size());
        testStudent.addGrade(82);
        assertEquals(2, testStudent.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        testStudent.addGrade(96);
        testStudent.addGrade(82);
        assertSame(96, testStudent.getGrades().get(0));
        assertSame(82, testStudent.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        testStudent.addGrade(90);
        testStudent.addGrade(70); // 160 / 2 = 80
        assertEquals(80, testStudent.getGradeAverage(), 0);
        testStudent.addGrade(50); // 210 / 3 = 70
        assertEquals(70, testStudent.getGradeAverage(), 0);
    }

}

