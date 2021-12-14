package by.bsuir.anna.wt.tasks.first.task15.runner;

import by.bsuir.anna.wt.tasks.first.scanner.InputData;
import by.bsuir.anna.wt.tasks.first.task12.logic.Book;
import by.bsuir.anna.wt.tasks.first.task15.logic.SortByAuthorThenTitle;
import by.bsuir.anna.wt.tasks.first.task15.logic.SortByAuthorThenTitleThenPrice;
import by.bsuir.anna.wt.tasks.first.task15.logic.SortByTitle;
import by.bsuir.anna.wt.tasks.first.task15.logic.SortByTitleThenAuthor;

import java.util.ArrayList;
import java.util.Comparator;

public class FifteenthTask {

    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        int booksCount;

        ArrayList<Comparator<Book>> comparators = getComp();

        System.out.print("Введете номер книги для сортировки: ");
        booksCount = InputData.inputPositiveInt();

        for (int i = 0; i < booksCount; i++) {
            try {
                System.out.println("Введите книгу " + (i + 1) + " out of " + booksCount);
                bookList.add(InputData.setInformationAboutBook());

            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка ввода: " + e.getMessage());
                i--;
            }
        }

        for (Comparator<Book> comparator : comparators) {
            bookList.sort(comparator);
            System.out.println(comparator.getClass().getName());
            for (Book book : bookList) {
                System.out.println("название: " + book.getTitle() + " автор: " + book.getAuthor() + " цена: " + book.getPrice()
                );

            }
        }

    }

    private static ArrayList<Comparator<Book>> getComp() {
        ArrayList<Comparator<Book>> comparators = new ArrayList<>();

        comparators.add(new SortByAuthorThenTitle());
        comparators.add(new SortByAuthorThenTitleThenPrice());
        comparators.add(new SortByTitle());
        comparators.add(new SortByTitleThenAuthor());
        return comparators;
    }

}
