import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testIfAddStudentWorks() {
        Cohort testCohort = new Cohort();
        assertEquals(0, testCohort.getStudents().size());
        testCohort.addStudent(new Student(7, "Tim"));
        assertEquals(1, testCohort.getStudents().size());
        Student stud = new Student(3,"Stud Body");
        testCohort.addStudent(stud);
        assertEquals(stud, testCohort.getStudents().get(1));
    }

    @Test
    public void testGetStudents() {
        Cohort cohort = new Cohort();
        cohort.addStudent(new Student(8, "Jim Johnly"));
        cohort.addStudent(new Student(8, "Jim Johnly"));
        cohort.addStudent(new Student(8, "Jim Johnly"));
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim Johnly", cohort.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage(){
        Cohort cohort = new Cohort();
        Student stud = new Student(1, "Stud Body");
        stud.addGrade(50);
        stud.addGrade(25);
        stud.addGrade(75);
        Student jenn = new Student(12, "Jenn Ann Hologram");
        jenn.addGrade(100);
        jenn.addGrade(100);
        jenn.addGrade(100);
        cohort.addStudent(stud);
        cohort.addStudent(jenn);
        assertEquals(75, cohort.getCohortAverage(), 0);
    }

}
