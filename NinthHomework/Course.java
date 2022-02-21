public class Course {

    public String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
    public boolean isFull() {
        if (getCourseName() != null) {
            return true;
        }
        return false;
    }
}

