package by.bsuir.anna.wt.tasks.first.task13.runner;

import by.bsuir.anna.wt.tasks.first.task12.logic.Book;
import by.bsuir.anna.wt.tasks.first.task13.logic.ProgrammerBook;

import static by.bsuir.anna.wt.tasks.first.scanner.InputData.*;

public class ThirteenthTask {
    public static void main(String[] args) {
        Book book1;
        Book book2;


        System.out.print("Введите издание книги: ");
        Book.setEdition(inputPositiveInt());

        try {

            System.out.println("Установите информацию о 1й книге");
            book1 = setInformationAboutBook();
            System.out.print("Введите язык книги: ");
            String language = inputString();
            System.out.print("Enter book level: ");
            int level = inputPositiveInt();
            book1 = new ProgrammerBook(book1, language, level);

            System.out.println("Установите информацию о 2й книге");
            book2 = setInformationAboutBook();
            System.out.print("Введите язык книги: ");
            String language1 = inputString();
            System.out.print("Введите уровень книги: ");
            int level1 = inputPositiveInt();
            book2 = new ProgrammerBook(book2, language1, level1);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Информация о 1 книге " + book1.toString());
        System.out.println("Информация о 2 книге " + book2.toString());
        System.out.println("Хэш-коды книг:");
        System.out.println("Хэш-код 1 книги: " + book1.hashCode());
        System.out.println("Хэш-код 2 книги: " + book2.hashCode());

        System.out.println("Равны ли книги? " + book1.equals(book2));


    }
}
