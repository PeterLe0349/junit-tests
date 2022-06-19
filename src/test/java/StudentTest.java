import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp(){
        student = new Student("Bob", 1234);
    }

    @Test
    public void testNameAndID(){
        assertEquals(student.getName(), "Bob");
        assertEquals(1234, 1234);
    }

    @Test
    public void testGrades(){
        assertEquals(0, student.getGrades().size());
        student.getGrades().add(100);
        student.getGrades().add(90);
        assertEquals(2, student.getGrades().size());
        assertEquals(95, student.getGradeAverage(), .5);
    }

    @Test
    public void deleteGrades(){
        assertEquals(0, student.getGrades().size());
        student.getGrades().add(100);
        student.getGrades().add(90);
        assertEquals(2, student.getGrades().size());
        assertEquals(95, student.getGradeAverage(), .5);
        System.out.println(student.deleteGrade(90));
        assertEquals(1, student.getGrades().size());
        assertEquals(100, student.getGradeAverage(), .5);
    }

    @Test
    public void updateGrades(){
        assertEquals(0, student.getGrades().size());
        student.getGrades().add(100);
        student.getGrades().add(90);
        assertEquals(2, student.getGrades().size());
        assertEquals(95, student.getGradeAverage(), .5);
        System.out.println(student.updateGrade(90,98));
        assertEquals(99, student.getGradeAverage(), .5);
    }




}
