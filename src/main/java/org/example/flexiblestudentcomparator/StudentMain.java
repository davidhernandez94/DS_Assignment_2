package org.example.flexiblestudentcomparator;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        Student.StudentComparator comp = s.new StudentComparator("id");

    }
}
