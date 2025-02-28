package org.example.flexiblestudentcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("d", 25, 5));
        students.add(new Student("b", 30, 8));
        students.add(new Student("c", 20, 10));
        students.add(new Student("d", 40, 3));
        students.add(new Student("e", 35, 12));

        Collections.sort(students, new Student.StudentComparator(null));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
