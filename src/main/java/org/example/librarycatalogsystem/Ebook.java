package org.example.librarycatalogsystem;

import java.util.Objects;

public class Ebook extends Book {
    private double fileSizeMB;

    public Ebook(String title, String author, int publicationYear, double fileSizeMB) {
        super(title, author, publicationYear);
        this.fileSizeMB = fileSizeMB;
    }

    public Ebook() {
        this("zoz", "beb", 2000, 0);
    }

    @Override
    public int compareTo(Book book) {
        if (book instanceof Ebook &&
                ((Ebook) book).getFileSizeMB() != fileSizeMB) {
            return (int) (fileSizeMB - ((Ebook) book).getFileSizeMB());
        }
        return super.compareTo(book);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n%-20s: MB %.1f", "File Size", fileSizeMB);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ebook ebook)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(fileSizeMB, ebook.fileSizeMB) == 0;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
