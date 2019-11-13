package nuigalway;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class StudentTest
{
    private String name = "bob";
    private LocalDate dob = new LocalDate(1997, 06, 27);
    private int id = 16343111;
    private int age = 22;
    private String username = "bob22";

    @Test
    public void shouldCreateStudent()
    {
        Student stu = new Student(name, dob, id);
        assertEquals(stu.getName(), name);
        assertEquals(stu.getDob(), dob);
        assertEquals(stu.getId(), id);
        assertEquals(stu.getAge(), age);
        assertEquals(stu.getUsername(), username);
    }

    @Test
    public void shouldUpdateStudent() {
        LocalDate newDob = new LocalDate(2001, 06, 27);
        String newName = "barry";
        int newAge = 18;
        String newUsername = "barry18";

        Student stu = new Student(name, dob, id);
        stu.setDob(newDob);
        assertEquals(stu.getDob(), newDob);
        assertEquals(stu.getAge(), newAge);
        stu.setName(newName);
        assertEquals(stu.getName(), newName);
        assertEquals(stu.getUsername(), newUsername);
    }
}
