import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IndexOutOfBoundsException {

        Course math = new Course("Math");
        Course language = new Course("Language");
        Course physics = new Course("Physics");
        Course chemistry = new Course("Chemistry");
        Course informatics = new Course("Informatics");

        ArrayList<Course> courses1 = new ArrayList<>();
        ArrayList<Course> courses2 = new ArrayList<>();
        ArrayList<Course> courses3 = new ArrayList<>();
        ArrayList<Course> courses4 = new ArrayList<>();

        Collections.addAll(courses1, math, physics, language);
        Collections.addAll(courses2, chemistry, physics);
        Collections.addAll(courses3, math, informatics);
        Collections.addAll(courses4, language, physics, informatics);

        Student student1 = new Student("Boba", courses1);
        Student student2 = new Student("Volodya", courses2);
        Student student3 = new Student("Sanya", courses3);
        Student student4 = new Student("Chelick", courses4);
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));

        //Первое задание
        try {
            System.out.println("==========Первое задание==========");
            students.stream()
                    .sorted((s1, s2) -> s2.getSCourses().size() - s1.getSCourses().size())
                    .forEach(s -> System.out.println(s.getName() + ": " + s.getSCourses().get(2).getCourseName() + " " +
                            s.getSCourses().get(1).getCourseName() + " " +
                            s.getSCourses().get(0).getCourseName()));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Пропуск");
        } finally {
            System.out.println("Список после пропуска (у студентов с 3 курсами не будет 3-го)");
            students.stream()
                    .sorted((s1, s2) -> s2.getSCourses().size() - s1.getSCourses().size())
                    .forEach(s -> System.out.println(s.getName() + ": " +
                            s.getSCourses().get(1).getCourseName() + " " +
                            s.getSCourses().get(0).getCourseName()));
        }

        //Второе задание
        System.out.println("==========Второе задание==========");
        System.out.println("Умнные парни - вот они, слева направо");
        students.stream()
                .sorted((s1, s2) -> s2.getSCourses().size() - s1.getSCourses().size())
                .limit(2)
                .forEach(s -> System.out.println(s.getName() + ": " + s.getSCourses().get(2).getCourseName() + " " +
                        s.getSCourses().get(1).getCourseName() + " " +
                        s.getSCourses().get(0).getCourseName()));

        //Третье задание
        System.out.println("==========Третье задание==========");
        students.stream()
                .filter(s -> s.courses.get(0).getCourseName().contains("Math"))
                .forEach(s -> System.out.println(s.getName() + ": " +
                s.getSCourses().get(0).getCourseName()));
    }
}
