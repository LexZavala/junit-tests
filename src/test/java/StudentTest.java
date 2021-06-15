<<<<<<< HEAD
import org.junit.Before;
=======
>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
<<<<<<< HEAD
    private Student testStude = new Student();

    @Before
    public static void setUp(){


    }

    @Test
    public void propertiesAreSet(){
//        assertNotNull("Lex", );
        assertEquals("Lex",testStudent);

=======

    @Test
    public void testIfStudentCanBeCreated(){
        Student fer = new Student(1L, "fer");
        Student nullStudent = null;
        assertNotNull(fer);
        assertNull(nullStudent);
    }

    @Test
    public void testIfFieldsAreSet(){
        Student fer = new Student(1L, "fer");
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());

        Student rosie = new Student(40L, "Rosie");
        assertEquals(40L, rosie.getId());
        assertEquals("Rosie", rosie.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        Student fer = new Student(1L, "fer");
        assertEquals(0, fer.getGrades().size());
        fer.addGrade(90);
        assertEquals(1, fer.getGrades().size());
        fer.addGrade(70);
        assertEquals(2, fer.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70);
        assertSame(90, fer.getGrades().get(0));
        assertSame(70, fer.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(90);
        fer.addGrade(70); // 160 / 2 = 80
        assertEquals(80, fer.getGradeAverage(), 0);
        fer.addGrade(50); // 210 / 3 = 70
        assertEquals(70, fer.getGradeAverage(), 0);
>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
    }

}
