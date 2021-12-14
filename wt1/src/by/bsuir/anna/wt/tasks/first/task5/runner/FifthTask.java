package by.bsuir.dshparko.wt.tasks.first.task5.runner;

import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.fillIntArray;
import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputInt;
import static by.bsuir.dshparko.wt.tasks.first.task5.logic.MinElement.getMinElements;

public class FifthTask {
    public static void main(String[] argv) {
        System.out.println("Введите размер массива: ");
        int n = inputInt();
        System.out.println("Введите элементы массива: ");
        int[] array = fillIntArray(n);
        try {

            System.out.println("Наименьшее количество элементов, которое можно выбросить : " + getMinElements(array));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}

