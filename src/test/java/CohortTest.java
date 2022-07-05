import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;



import java.util.ArrayList;
import java.util.List;


public class CohortTest {
    Cohort umbriel;

    @Before
    public void setUp(){
        umbriel = new Cohort();
        List<String> str1 = new ArrayList<>();
        List<String> str2 = Lists.reverse(str1);


    }
//ToDone
//    A Cohort instance can add a Student to the List of students.
    @Test
    public void addStudent(){
//        System.out.println(umbriel.getStudents());
        umbriel.addStudent(new Student(123, "Bob"));
        assertEquals(umbriel.getStudents().size(), 1);
        assertEquals(umbriel.getStudents().get(0).getName(), "Bob");
        assertEquals(umbriel.getStudents().get(0).getId(), 123);

    }
    //ToDOne
//    A Cohort instance can get the current List of students.
    @Test
    public void getCurrentList(){
        umbriel.addStudent(new Student(123, "Bob"));
        umbriel.addStudent(new Student(123, "Bob2"));
        umbriel.addStudent(new Student(123, "Bob3"));
        assertEquals(umbriel.getStudents().size(), 3);

    }
    //ToDo
//    A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testGetAverage(){
        umbriel.addStudent(new Student(123, "Bob"));
        umbriel.addStudent(new Student(123, "Bob2"));
        umbriel.addStudent(new Student(123, "Bob3"));
        assertEquals(umbriel.getStudents().size(), 3);
        int grade = 70;
        umbriel.getStudents().get(0).addGrade(70);
        for(Student i: umbriel.getStudents()){
            i.addGrade(grade);
            grade += 10;
        }
        for(Student i: umbriel.getStudents()){
            System.out.println(i.getGrades());
        }
        System.out.println(umbriel.getCohortAverage());
    }


    @Test
    public void testMade(){
        int size = umbriel.getStudents().size();
        assertEquals(size, 0);
    }

    @Test
    public void testFindStudentByID() {
        umbriel.addStudent(new Student(123, "Bob"));
        umbriel.addStudent(new Student(1234, "Bob2"));
        umbriel.addStudent(new Student(12345, "Bob3"));
        assertEquals("Bob2", umbriel.findStudentById(1234).getName());
    }






}
