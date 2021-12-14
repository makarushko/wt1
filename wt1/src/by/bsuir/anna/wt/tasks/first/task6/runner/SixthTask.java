package by.bsuir.anna.wt.tasks.first.task6.runner;

import static by.bsuir.anna.wt.tasks.first.printer.PrintData.printIntMatrix;
import static by.bsuir.anna.wt.tasks.first.scanner.InputData.fillIntArray;
import static by.bsuir.anna.wt.tasks.first.scanner.InputData.inputInt;
import static by.bsuir.anna.wt.tasks.first.task6.logic.Matrix.fillMatrix;

public class SixthTask {
    public static void main(String[] argv) {
        System.out.println("Введите размер массива: ");
        int n = inputInt();
        System.out.println("Введите элементы массива: ");
        int array[] = fillIntArray(n);
        try {
            int[][] matrix = fillMatrix(array);
            printIntMatrix(matrix);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
