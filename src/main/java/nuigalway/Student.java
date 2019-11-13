package nuigalway;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Student 
{
    private String name;
    private int age;
    private LocalDate dob;
    private int id;
    private String username;
    // private Course course
    // private List<Module> modules

    public Student(String name, LocalDate dob, int id){
        this.name = name;
        this.dob = dob;
        this.id = id;

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

    private void setAge() {
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

    private void setUsername() {
        this.username = name + age;
    }

    public String getUsername() {
        return username;
    }
}
