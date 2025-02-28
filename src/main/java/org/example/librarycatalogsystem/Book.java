package org.example.librarycatalogsystem;

import java.util.Comparator;
import java.util.Objects;

public abstract class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Book() {
        this("zoz", "beb", 2000);
    }

    public int compareTo(Book book) {
        return this.publicationYear - book.getPublicationYear();
    }

    @Override
    public String toString() {
        return String.format("\n%-20s: %s\n%-20s: %s\n%-20s: %d",
                "Title", title, "Author", author, "Publication Year", publicationYear);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
