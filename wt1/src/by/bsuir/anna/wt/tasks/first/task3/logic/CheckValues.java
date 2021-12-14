package by.bsuir.dshparko.wt.tasks.first.task3.logic;

public class CheckValues {

    public static void checkParam(double a, double b, double h) {
        if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(h)) {
            throw new IllegalArgumentException("Необходимо ввести конечные числа!");
        }
        if (b < a) {
            throw new IllegalArgumentException("Значение а должно быть больше b!");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("Шаг должен иметь значение больше 0!");
        }
    }
}