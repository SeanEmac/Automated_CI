package nuigalway;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ModuleTest 
{
    private String moduleName = "Software Engineering";
    private String id = "CT417";
    private LocalDate start = new LocalDate(2019, 9, 1);
    private LocalDate end = new LocalDate(2020, 5, 1);
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    
    @Test
    public void shouldCreateModule() {   
        Module module = new Module(moduleName, id, students);
        assertEquals(module.getName(), moduleName);
        assertEquals(module.getId(), id);
        assertEquals(module.getStudents().size(), 0);
    }

    @Test
    public void shouldUpdateModule() {
        CourseProgram course = new CourseProgram("CS", start, end, modules, students);
        Module module = new Module(moduleName, id, students);
        Student student = new Student("bob", new LocalDate(1997, 5, 1), 163436183, course, Arrays.asList(module));
        student.addModule(module);

        module.addStudent(student);
        assertEquals(module.getStudents().get(0), student);
        assertEquals(module.getStudents().get(0).getName(), "bob");

        module.removeStudent(student);
        assertEquals(module.getStudents().size(), 0);
    }
}
