package april.classwork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTester {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Tom", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("John", 15, "Economics", 77.5));
        studentList.add(new Student("Alex", 16, "Mathematics", 89.4));
        studentList.add(new Student("James", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Adam", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        List<Student> top3Students =
                studentList.stream()
                        .sorted(Comparator.comparingDouble(s->((Student) s).getPercentage()).reversed())
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(top3Students);

        String namesJoined = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));System.out.println(namesJoined);
        System.out.println(namesJoined);

        Map<String, List<Student>> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(studentsGroupedBySubject);

        System.out.println(Thread.currentThread());
    }
}
