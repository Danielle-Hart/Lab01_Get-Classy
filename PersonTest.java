import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;

class PersonTest {
    private Person person;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        person = new Person("John", "Doe", "JD001", "Mr.", 1990);}

    @Test
    void testCONSTRUCTORSANDGETTERS(){
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("JD001", person.getID());
        assertEquals("Mr.", person.getTitle());
        assertEquals(1990, person.getYOB());
    }

    @Test
    void testSETTERS(){
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setTitle("Ms.");
        person.setYOB(1995);

        assertEquals("Jane", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals("Ms.", person.getTitle());
        assertEquals(1995, person.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("John Doe", person.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Mr. John Doe", person.formalName());
    }

    @Test
    void testGetAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int expectedAge = currentYear - 1990;
        assertEquals(String.valueOf(expectedAge), person.getAge());
    }

    @Test
    void testGetAge1() {
        assertEquals("30", person.getAge(2020));
    }

    @Test
    void toCSV() {
        assertEquals("JD001,John,Doe,Mr.,1990", person.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{\"ID\":\"JD001\",\"firstName\":\"John\",\"lastName\":\"Doe\",\"Title\":\"Mr.\",\"YOB\":1990}", person.toJSON());
    }

    @Test
    void toXML() {
        assertEquals("<person><ID>JD001</ID><firstName>John</firstName><lastName>Doe</lastName><title>Mr.</Title><YOB>1990</YOB></person>", person.toXML());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID = 'JD001', firstName = 'John', lastName = 'Doe', Title = 'Mr.', YOB = 1990}", person.toString());
    }

    @Test
    void testEquals() {
        Person personA = new Person("John", "Doe", "JD001", "Mr.", 1990);
        Person personB = new Person("Jane", "Smith", "JS001", "Ms.", 1995);

        assertTrue(person.equals(personA));
        assertFalse(person.equals(personB));

    }
}