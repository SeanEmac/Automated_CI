package nuigalway;

import org.joda.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseProgram {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Module> modules;
    private List<Student> students;

    public CourseProgram(String name, LocalDate startDate, LocalDate endDate,
                    List<Module> modules, List<Student> students) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = new ArrayList<Module>(modules);
        this.students = new ArrayList<Student>(students);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean addModule(Module module) {
        return modules.add(module);
    }
    
    public boolean removeModule(Module module) {
        return modules.remove(module);
    }

    public List<Module> getModules() {
        return modules;
    }
    
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    public boolean removeStudent(Student student) {
        return students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}