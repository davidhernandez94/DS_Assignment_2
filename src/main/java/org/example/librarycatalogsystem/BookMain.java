package org.example.librarycatalogsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Ebook());
        books.add(new Ebook("a", "p", 1995, 340));
        books.add(new PrintedBook("The Castle", "Franz Kafka", 19, 45));
        Collections.sort(books);

        List<Ebook> ebooks = new ArrayList<>();
        ebooks.add(new Ebook());
        ebooks.add(new Ebook("a", "p", 1995, 340));
        ebooks.add(new Ebook("The Castle", "Franz Kafka", 19, 45));
        Collections.sort(ebooks);

        List<PrintedBook> pbooks = new ArrayList<>();
        pbooks.add(new PrintedBook());
        pbooks.add(new PrintedBook("a", "p", 1995, 340));
        pbooks.add(new PrintedBook("The Castle", "Franz Kafka", 19, 45));
        Collections.sort(pbooks);



        for (PrintedBook pbook : pbooks) {
            System.out.println(pbook);
        }

    }
}
