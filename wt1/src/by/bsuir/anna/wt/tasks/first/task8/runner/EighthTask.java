package by.bsuir.anna.wt.tasks.first.task8.runner;

import by.bsuir.anna.wt.tasks.first.scanner.InputData;

import java.util.ArrayList;

import static by.bsuir.anna.wt.tasks.first.task8.logic.SequencesMerging.merge;

public class EighthTask {
    public static void main(String[] args) {

        System.out.println("Введите размер 1 последовательности: ");
        int n1 = InputData.inputInt();

        System.out.println("Введите 1 последовательность");
        double[] sequence1 = InputData.inputDoubleArray(n1);

        System.out.println("Введите размер 1 последовательности: ");
        int n2 = InputData.inputInt();

        System.out.println("Введите 2 последовательность");
        double[] sequence2 = InputData.inputDoubleArray(n2);

        try {
            ArrayList<Double> finalSequence = merge(sequence1, sequence2);
            System.out.println("Конечная последовательность: " + (finalSequence.toString().substring(1, finalSequence.toString().length() - 1)));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
