package org.example.flexiblestudentcomparator;

import java.util.Comparator;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private double score;
    private int age;
    private static int nextId = 1;

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
        this.id = nextId++;
    }

    public Student() {
        this("lql", 0, 0);
    }

    public class StudentComparator implements Comparator<Student> {
        private final String sortType;

        public StudentComparator(String sortType) {
            this.sortType = sortType;
        }

        public int compare(Student student1, Student student2) {
            return switch(sortType) {
                case "score" -> student1.score == student2.score
                        ? student2.age - student1.age
                        : (int) (student1.score - student2.score);
                case "name" -> student2.name.equals(student1.name)
                        ? student1.id - student2.id
                        : student2.name.compareTo(student1.name);
                default -> student2.id == student1.id
                        ? student1.age - student2.age
                        : student2.id - student1.id;

            };
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s: %06d\n%-20s: %s\n%-20s: %s%.2f\n%-20s: %d\n",
                "ID", id, "Name", name, "Score", "%", score, "Age", age);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id == student.id && Double.compare(score, student.score) == 0 && age == student.age && Objects.equals(name, student.name);
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }
}
