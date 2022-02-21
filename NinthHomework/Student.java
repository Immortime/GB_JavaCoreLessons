import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    public String name;
    public ArrayList<Course> courses;

    public Student(String name, ArrayList<Course> courses) {
        this.name = name;
        this.courses = courses;

    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    public ArrayList<Course> getSCourses() {
        return courses;
    }
}
