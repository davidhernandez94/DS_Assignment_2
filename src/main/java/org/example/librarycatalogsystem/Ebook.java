package org.example.librarycatalogsystem;

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
        if (book.getClass() == Ebook.class &&
                ((Ebook) book).getFileSizeMB() == fileSizeMB) {
            return (int) (fileSizeMB - ((Ebook) book).getFileSizeMB());
        }
        return super.compareTo(book);
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
}
