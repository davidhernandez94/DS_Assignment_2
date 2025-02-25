# P2 - Assignment02

## **Due Date:** 

03-03 23:57:00

## **Submission:**

**Please submit four .java files in total. Do not zip your files**.

* one .java files for task 1, 2 and 3 (Main.java)
* one .java files for task 4.1 (Author.java)
* one .java files for task 4.2 (Book.java)
* one .java files for task 4.3 (MyLibrary.java)

**Full Score**: 100

## Key Concepts for This Assignment

1. Inheritance
2. Polymorphism
3. Abstract class
4. Interface
5. Comparable
6. Comparator

## Task 1: Employee Management System

### Description:

Design an Employee Management System that has different types of employees. The system should be able to display employee details, calculate salaries, and apply bonuses.

### Requirements:

1. Create an abstract class Employee with the following fields:
  - `String name`
  - `int id`
  - `double baseSalary`
  - Abstract method `double calculateSalary()`
  - Concrete method `void displayDetails()` to print employee information.
2. Create two subclasses:
  - `FullTimeEmployee`: The salary is calculated as `baseSalary + performanceBonus`.
  - `PartTimeEmployee`: The salary is calculated as `hourlyRate * hoursWorked`.
3. Create an interface BonusEligible with a method:
  - `double calculateBonus(int performanceRating)`;
  - Only `FullTimeEmployee` should implement this interface. If the rating is `>= 8`, give a `10%` bonus, otherwise, `5%`.
4. Test the system by creating an array of Employee objects (both full-time and part-time), displaying their details, and calculating their salaries.

## Task 2: Library Catalog System

### Description:

You need to design a Library Catalog System that keeps track of books and their details.

### Requirements:
1. Create an abstract class Book with:
  - `String title`
  - `String author`
  - `int publicationYear`
  - `Abstract method void displayInfo()`
2. Create two subclasses:
  - Ebook: Additional field double fileSizeMB
  - PrintedBook: Additional field int numOfPages
3. Implement Comparable<Book>:
  - Compare books by publicationYear (older books first).
4. Sort and display books:
  - Store books in an ArrayList<Book> and sort them using Collections.sort().

## Task 3: Flexible Student Comparator

### Description:

You need to compare students dynamically using a single comparator that supports three different sorting strategies. The default sorting is by id, and when there is a tie, a secondary field will be used.

### Requirements:
	
1. Create a class Student with:
  - `int id`
  - `String name`
  - `double score`
  - `int age`
2. Create a `StudentComparator` class that implements `Comparator<Student>` with a private field:
  - `String sortType` (values: `"score"`, `"name"`, `"id"`)
  - Constructor: `public StudentComparator(String sortType)`
  - In `compare()`, apply the following logic:
    - If `sortType.equals("score")`, sort by `score` descending → if `scores` are equal, sort by `age` ascending.
    - If `sortType.equals("name")`, sort by `name` ascending → if `names` are equal, sort by `id` ascending.
    - Default sorting is by `id` ascending → if `IDs` are equal, sort by `age` descending.
3.	Test the system in main():
  - Create an `ArrayList<Student>` with at least 5 students.
  - Use `StudentComparator("score")` to sort and display results.
  - Use `StudentComparator("name")` to sort and display results.
  - Use `StudentComparator("id")` to sort and display results.

### Example:

| ID  | Name    | Score | Age |
|-----|---------|-------|-----|
| 102 | Alice   | 85.0  | 20  |
| 104 | Bob     | 85.0  | 22  |
| 101 | Charlie | 92.0  | 19  |
| 103 | David   | 85.0  | 20  |

- `"score"` → Sorted by `score` descending, `age` ascending
Charlie → Alice → David → Bob
- `"name"` → Sorted by `name` ascending, `id` ascending
Alice → Bob → Charlie → David
- `"id"` (default) → Sorted by `id` ascending, `age` descending
101 → 102 → 103 → 104
