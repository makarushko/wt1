package by.bsuir.anna.wt.tasks.first.task12.runner;

import by.bsuir.anna.wt.tasks.first.task12.logic.Book;

import static by.bsuir.anna.wt.tasks.first.scanner.InputData.inputPositiveInt;
import static by.bsuir.anna.wt.tasks.first.scanner.InputData.setInformationAboutBook;

public class Runner {
    public static void main(String[] args) {

        Book book1;
        Book book2;


        System.out.print("Введите издание книги: ");
        Book.setEdition(inputPositiveInt());

        try {

            System.out.println("Установите информацию о 1й книге");
            book1 = setInformationAboutBook();

            System.out.println("Установите информацию о 2й книге");
            book2 = setInformationAboutBook();

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return;
        }


        System.out.println("Хэш-коды книг:");
        System.out.println("Хэш код 1й книги: " + book1.hashCode());
        System.out.println("Хэш код 2й книги: " + book2.hashCode());

        System.out.println("Равны ли книги? " + book1.equals(book2));

        System.out.println("Сравните книг: " + book1.compareTo(book2));

    }
}
