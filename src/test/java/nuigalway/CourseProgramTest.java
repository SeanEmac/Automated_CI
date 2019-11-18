package nuigalway;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;


public class CourseProgramTest {
    private String courseName = "CS";
    private LocalDate start = new LocalDate(2019, 9, 1);
    private LocalDate end = new LocalDate(2020, 5, 1);
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    
    @Test
    public void shouldCreateCourse() {   
        CourseProgram course = new CourseProgram(courseName, start, end, modules, students);
        assertEquals(course.getName(), courseName);
        assertEquals(course.getStartDate(), start);
        assertEquals(course.getEndDate(), end);
        assertEquals(course.getModules().size(), 0);
        assertEquals(course.getStudents().size(), 0);
    }

    @Test
    public void shouldUpdateCourse() {
        CourseProgram course = new CourseProgram(courseName, start, end, modules, students);
        Student student = new Student("bob", new LocalDate(1997, 5, 1), 163436183, course, modules);
        Module module = new Module("Software Engineering", "CT417", students);
        student.addModule(module);
        module.addStudent(student);

        course.addModule(module);
        course.addStudent(student);
        assertEquals(course.getModules().get(0), module);
        assertEquals(course.getStudents().get(0), student);
        assertEquals(course.getStudents().get(0).getName(), "bob");

        course.removeModule(module);
        course.removeStudent(student);
        assertEquals(course.getModules().size(), 0);
        assertEquals(course.getStudents().size(), 0);
    }
}
