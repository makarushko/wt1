package by.bsuir.anna.wt.tasks.first.task15.logic;

import by.bsuir.anna.wt.tasks.first.task12.logic.Book;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Обе книги должны иметь какое-либо значение");
        }

        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
