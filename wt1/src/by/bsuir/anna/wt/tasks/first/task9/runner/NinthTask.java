package by.bsuir.anna.wt.tasks.first.task9.runner;

import by.bsuir.anna.wt.tasks.first.scanner.InputData;
import by.bsuir.anna.wt.tasks.first.task9.classes.Ball;
import by.bsuir.anna.wt.tasks.first.task9.classes.Basket;
import by.bsuir.anna.wt.tasks.first.task9.logic.DoTask;

public class NinthTask {
    public static void main(String[] args) {

        Basket basket = new Basket();
        fill(basket);

        try {
            System.out.println("Вес мячей в корзине: " + DoTask.getBallsWeight(basket));
            System.out.println("Количество синих мячей: " + DoTask.getCountOfColoredBalls(basket, "blue"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void fill(Basket basket) {
        int ballsCount;
        double ballWeight;
        String ballColor;

        System.out.print("Введите количество мячей: ");
        ballsCount = InputData.inputPositiveInt();

        for (int i = 0; i < ballsCount; i++) {
            System.out.println("Мяч " + (i + 1) + " из " + ballsCount);

            System.out.print("Введите вес мяча: ");
            ballWeight = InputData.inputPositiveDouble();

            System.out.print("Введите цвет мяча: ");
            ballColor = InputData.inputString();

            basket.addBall(new Ball(ballColor, ballWeight));
        }
    }
}
