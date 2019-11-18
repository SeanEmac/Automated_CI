package nuigalway;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest
{
    private String name = "bob";
    private LocalDate dob = new LocalDate(1997, 06, 27);
    private int id = 16343111;
    private ArrayList<Student> students = new ArrayList<Student>();
    private List<Module> modules = Arrays.asList(new Module("Software Engineering", "CT417", students));
    private CourseProgram course = new CourseProgram("CS", new LocalDate(2019, 9, 1),
                                                new LocalDate(2020, 5, 1), modules, students);
    private int age = 22;
    private String username = "bob22";

    @Test
    public void shouldCreateStudent()
    {
        Student student = new Student(name, dob, id, course, modules);
        assertEquals(student.getName(), name);
        assertEquals(student.getDob(), dob);
        assertEquals(student.getId(), id);
        assertEquals(student.getAge(), age);
        assertEquals(student.getUsername(), username);
        assertEquals(student.getCourse(), course);
        assertEquals(student.getModules().size(), 1);
    }

    @Test
    public void shouldUpdateStudent() {
        LocalDate newDob = new LocalDate(2001, 06, 27);
        String newName = "barry";
        int newAge = 18;
        Student student = new Student(name, dob, id, course, modules);

        student.setDob(newDob);
        assertEquals(student.getDob(), newDob);
        // Age and username should also be updated
        assertEquals(student.getAge(), newAge);
        assertEquals(student.getUsername(), "bob18");

        student.setName(newName);
        assertEquals(student.getName(), newName);
        // Username should also be updated
        assertEquals(student.getUsername(), "barry18");

        // Just checking that add and remove modules returns boolean success
        assertTrue(student.removeModule(modules.get(0)));
        assertEquals(student.getModules().size(), 0);

        assertFalse(student.removeModule(modules.get(0)));
        assertEquals(student.getModules().size(), 0);
    }
}
