package org.example.librarycatalogsystem;

public class PrintedBook extends Book {
    private int numOfPages;

    public PrintedBook(String title, String author, int publicationYear, int numOfPages) {
        super(title, author, publicationYear);
        this.numOfPages = numOfPages;
    }

    public PrintedBook() {
        this("zoz", "beb", 2000, 0);
    }

    public int compareTo(Book book) {
        if (book.getClass() == PrintedBook.class &&
                ((PrintedBook) book).getNumOfPages() == numOfPages) {
            return (int) (((PrintedBook) book).getNumOfPages() - numOfPages);
        }
        return super.compareTo(book);
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
}
