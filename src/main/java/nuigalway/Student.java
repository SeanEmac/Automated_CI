package nuigalway;

import org.joda.time.LocalDate;
import org.joda.time.Years;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private LocalDate dob;
    private int id;
    private String username;
    private CourseProgram course;
    private List<Module> modules;

    public Student(String name, LocalDate dob, int id, CourseProgram course, List<Module> modules){
        this.name = name;
        this.dob = dob;
        this.id = id;
        this.course = course;
        this.modules = new ArrayList<Module>(modules);

        setAge();
        setUsername();
    }

    public void setName(String name) {
        this.name = name;
        setUsername();
    }

    public String getName() {
        return name;
    }

    /*
        Age is calculated using date of birth.
        If DOB is updated then so is Age. 
    */
    public void setAge() {
        this.age = Years.yearsBetween(dob, new LocalDate()).getYears();
        setUsername();
    }

    public int getAge() {
        return age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        setAge();
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /*
        Username is made up of name + age.
        When name or age is udated, username is also updated.
    */
    public void setUsername() {
        this.username = name + age;
    }

    public String getUsername() {
        return username;
    }

    public void setCourse(CourseProgram course) {
        this.course = course;
    }

    public CourseProgram getCourse() {
        return course;
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
}
