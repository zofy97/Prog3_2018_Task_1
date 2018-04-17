import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    Student s = new Student("Hans", "Wurst", 20, Workdays.SUNDAY, "HTW", "IT");

    @org.junit.Test
    public void getFirstname() {
        String expected = "Hans";
        assertEquals(expected, s.getFirstname());
    }

    @org.junit.Test
    public void getLastname() {
        String expected = "Wurst";
        assertEquals(expected, s.getLastname());
    }

    @org.junit.Test
    public void getAge() {
        int expected = 20;
        assertEquals(expected, s.getAge());
    }

    @org.junit.Test
    public void getFreeWorkday() {
        Workdays expected = Workdays.SUNDAY;
        assertEquals(expected, s.getFreeWorkday());
    }

    @org.junit.Test
    public void setFirstname() {
        s.setFirstname("Max");
        assertTrue(s.getFirstname() == "Max");
    }

    @org.junit.Test
    public void setLastname() {
        s.setLastname("Mustermann");
        assertTrue(s.getLastname() == "Mustermann");
    }

    @org.junit.Test
    public void setAge() {
        s.setAge(30);
        assertTrue(s.getAge() == 30);
    }

    @org.junit.Test
    public void setFreeWorkday() {
        s.setFreeWorkday(Workdays.SATURDAY);
        assertTrue(s.getFreeWorkday() == Workdays.SATURDAY);
    }
}
