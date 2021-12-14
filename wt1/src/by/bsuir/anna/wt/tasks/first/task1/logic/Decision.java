package by.bsuir.anna.wt.tasks.first.task1.logic;

public class Decision {
    public static double countEquation(double x, double y) {
        double nominator = (1 + Math.pow(Math.sin(x + y), 2));
        double denominator = (2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
        double result = nominator / denominator + x;
        return result;
    }
}
