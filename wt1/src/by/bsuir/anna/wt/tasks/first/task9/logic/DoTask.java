package by.bsuir.dshparko.wt.tasks.first.task9.logic;

import by.bsuir.dshparko.wt.tasks.first.task9.classes.Ball;
import by.bsuir.dshparko.wt.tasks.first.task9.classes.Basket;

import java.util.LinkedList;

public class DoTask {

    public static double getBallsWeight(Basket basket) {
        double weight = 0;

        if (basket == null) {
            throw new IllegalArgumentException("Корзина не должна быть пустой");
        }

        for (Ball ball : basket.getBallsList()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    private static LinkedList<Ball> getBallsListByColour(Basket basket, String colour) {
        LinkedList<Ball> ballsList = new LinkedList<>();

        if (basket == null) {
            throw new IllegalArgumentException("Корзина не должна быть пустой");
        }
        if ((colour == null) || colour.isEmpty()) {
            throw new IllegalArgumentException("Должен быть установлен цвет");
        }

        for (Ball ball : basket.getBallsList()) {

            if (ball.getColour().equalsIgnoreCase(colour)) {
                ballsList.add(ball);
            }
        }
        return ballsList;
    }


    public static int getCountOfColoredBalls(Basket basket, String colour) throws IllegalArgumentException {
        return getBallsListByColour(basket, colour).size();
    }
}