package by.bsuir.anna.wt.tasks.first.task4.runner;

import static by.bsuir.anna.wt.tasks.first.printer.PrintData.printIntArray;
import static by.bsuir.anna.wt.tasks.first.scanner.InputData.fillIntArray;
import static by.bsuir.anna.wt.tasks.first.scanner.InputData.inputInt;
import static by.bsuir.anna.wt.tasks.first.task4.logic.PrimeNumber.findSimpleNumbers;

public class FourthTask {
    public static void main(String[] argv) {
        System.out.println("Введите размер массива: ");
        int n = inputInt();
        System.out.println("Введите элементы массива: ");
        int[] array = fillIntArray(n);
        try {

            int[] arr = findSimpleNumbers(array);
            printIntArray(arr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
