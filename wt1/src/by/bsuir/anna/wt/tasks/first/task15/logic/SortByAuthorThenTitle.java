package by.bsuir.dshparko.wt.tasks.first.task15.logic;

import by.bsuir.dshparko.wt.tasks.first.task12.logic.Book;

import java.util.Comparator;

public class SortByAuthorThenTitle implements Comparator<Book> {

    Comparator<Book> comparator;

    public SortByAuthorThenTitle() {

        comparator = new SortByAuthor().thenComparing(new SortByTitle());
    }

    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Обе книги должны иметь какое-либо значение");
        }

        return comparator.compare(book1, book2);
    }

}
