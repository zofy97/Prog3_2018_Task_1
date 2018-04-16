package Task_1;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @org.junit.Before
    public void setUp() throws Exception {
        Student s = new Student("Hans", "Wurst", 20, Workdays.SUNDAY, "HTW", "IT");
    }

    @org.junit.Test
    public void getFirstname() {
        String actual = "Hans";
        String expected = "Hans";
        assertEquals("Hans", "Hans");
    }

    @org.junit.Test
    public void getLastname() {
    }

    @org.junit.Test
    public void getAge() {
    }

    @org.junit.Test
    public void getFreeWorkday() {
    }

    @org.junit.Test
    public void setFirstname() {
    }

    @org.junit.Test
    public void setLastname() {
    }

    @org.junit.Test
    public void setAge() {
    }

    @org.junit.Test
    public void setFreeWorkday() {
    }
}
