import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
String testString;
    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();

    private List<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
        this.testString = "";
    }

    @Test
    public void assertBooleans(){
        String language = "PHP";
        boolean tru = language.contains("H"); // use assertTrue for this statement
        boolean fal = language.contains("J"); // use assertFalse for this statement
        assertTrue(tru);
        assertFalse(fal);
    }

    @Test
    public void testSameArrays(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);
    }

    @Test
    public void isSameArrays(){
        assertNotSame(languages, moreLanguages);
    }


    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("Fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }

    @Test
    public void testIfInstanceIsNull() {
//        Student phone = new Student("Bob");
//        Student laptop = null;
//        assertNull(null);
//        assertNotNull(phone);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testTwoArrays(){
        String[] str1 = {"Bob"};
        String[] str2 = {"Bob"};
        assertArrayEquals(str1, str2);
    }


    @Test
    public void testTwoStrings(){
        String str = "CodeUp";
        String str2 = "CodeUp";
        assertEquals(str, str2);
    }

    @Test
    public void testArrays(){
//        Student[] girls = {new Student("Jane")};
//        Student[] boys = girls;
////        Student[] boys = {new Student("Jane")};
//        assertArrayEquals(girls, boys);

    }

    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

// When you're using floating points values a third parameter is required (Delta) which represents a positive margin of error of decimals.

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testTestString(){
        testString = "abc";
        assertEquals(testString, "abc");
    }

    @Test
    public void testTestString2(){
        assertEquals(testString, "");
    }


//    public static boolean areTwins(List<String>, List<String>){
//        return assert
//    }


}
