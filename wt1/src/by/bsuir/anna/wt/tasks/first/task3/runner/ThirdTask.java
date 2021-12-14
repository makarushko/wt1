package by.bsuir.dshparko.wt.tasks.first.task3.runner;


import by.bsuir.dshparko.wt.tasks.first.task3.logic.CheckValues;
import by.bsuir.dshparko.wt.tasks.first.task3.logic.FindFunction;
import by.bsuir.dshparko.wt.tasks.first.task3.logic.PrintTable;

import static by.bsuir.dshparko.wt.tasks.first.scanner.InputData.inputDouble;

public class ThirdTask {
    public static void main(String[] argc) {
        System.out.print("Введите a: ");
        double a = inputDouble();

        System.out.print("Введите b: ");
        double b = inputDouble();

        System.out.print("Введите h: ");
        double h = inputDouble();
        try {
            CheckValues.checkParam(a, b, h);
            double[][] arr = FindFunction.findAnswer(a, b, h);
            PrintTable.printArrayDouble(arr);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
