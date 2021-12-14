package by.bsuir.anna.wt.tasks.first.task1.runner;

import static by.bsuir.anna.wt.tasks.first.scanner.InputData.inputDouble;
import static by.bsuir.anna.wt.tasks.first.task1.logic.Decision.countEquation;

public class FirstTask {
    public static void main(String[] argv) {
        System.out.println("Введите x: ");
        double x = inputDouble();
        System.out.println("Введите y: ");
        double y = inputDouble();
        try {
            double result = countEquation(x, y);
            System.out.println("Результат уравнения" + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
