package IO;

import java.util.Arrays;

public class Student {
    static int currentId = 1;
    int id;
    String name;
    String[] courses;
    double gpa;

    public Student() {
    }

    public Student(String name, String[] courses, double gpa) {
        this.id = currentId++;
        this.name = name;
        this.courses = courses.clone();
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", gpa=" + gpa +
                '}';
    }
}
