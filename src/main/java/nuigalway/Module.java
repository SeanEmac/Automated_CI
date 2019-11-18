package nuigalway;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private String name;
    private String id;
    private List<Student> students;

    public Module(String name, String id, List<Student> students) {
        this.name = name;
        this.id = id;
        this.students = new ArrayList<Student>(students);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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