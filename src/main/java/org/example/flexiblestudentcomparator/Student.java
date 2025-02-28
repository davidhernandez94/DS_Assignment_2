package org.example.flexiblestudentcomparator;

import java.util.Comparator;
import java.util.Objects;

public class Student{
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

    public static class StudentComparator implements Comparator<Student> {
        private static String sortType;

        /**
         * compares Students
         * if sortType is "scores", sort by scores descending, if scores are equal, age ascending
         * if sortType is "name", sort by name ascending, if names are equal, id ascending
         * default sortType, sort by id ascending, if id are equal, age descending
         * @param sortType type of sorting
         */
        public StudentComparator(String sortType) {
            this.sortType = sortType;
        }

        public int compare(Student student1, Student student2) {
            return switch(sortType) {
                case "score" -> student1.score == student2.score
                        ? student1.age - student2.age
                        : (int) (student2.score - student1.score);
                case "name" -> student2.name.equals(student1.name)
                        ? student1.id - student2.id
                        : student1.name.compareTo(student2.name);
                case null, default -> student2.id == student1.id
                        ? student2.age - student1.age
                        : student1.id - student2.id;
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
}
