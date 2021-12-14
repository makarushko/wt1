package by.bsuir.anna.wt.tasks.first.task2.runner;

import static by.bsuir.anna.wt.tasks.first.scanner.InputData.inputDouble;
import static by.bsuir.anna.wt.tasks.first.task2.logic.PointAffiliation.checkAffiliation;

public class SecondTask {
    public static void main(String[] argc) {
        System.out.println("Введите x: ");
        double x = inputDouble();
        System.out.println("Введите y: ");
        double y = inputDouble();
        boolean isAnswer = checkAffiliation(x, y);
        System.out.println("Точка[" + x + "," + y + "] принадлежит области?(true/false) " + isAnswer);
    }
}
