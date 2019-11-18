package nuigalway;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest
{
    private String name = "bob";
    private LocalDate dob = new LocalDate(1997, 06, 27);
    private int id = 16343111;
    private Module module = new Module("Software Engineering", "CT417", new ArrayList<Student>());
    private CourseProgram course = new CourseProgram("CS", new LocalDate(2019, 9, 1), new LocalDate(2020, 5, 1), 
                                                new ArrayList<Module>(), new ArrayList<Student>());
    private int age = 22;
    private String username = "bob22";

    @Test
    public void shouldCreateStudent()
    {
        Student stu = new Student(name, dob, id, course, new ArrayList<Module>());
        stu.addModule(module);
        assertEquals(stu.getName(), name);
        assertEquals(stu.getDob(), dob);
        assertEquals(stu.getId(), id);
        assertEquals(stu.getAge(), age);
        assertEquals(stu.getUsername(), username);
        assertEquals(stu.getCourse(), course);
        assertEquals(stu.getModules().size(), 1);
    }

    @Test
    public void shouldUpdateStudent() {
        LocalDate newDob = new LocalDate(2001, 06, 27);
        String newName = "barry";
        int newAge = 18;
        String newUsername = "barry18";

        Student stu = new Student(name, dob, id, course, new ArrayList<Module>());
        stu.setDob(newDob);
        assertEquals(stu.getDob(), newDob);
        assertEquals(stu.getAge(), newAge);
        stu.setName(newName);
        assertEquals(stu.getName(), newName);
        assertEquals(stu.getUsername(), newUsername);
    }
}
