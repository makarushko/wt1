package by.bsuir.dshparko.wt.tasks.first.task8.logic;

import java.util.ArrayList;

public class SequencesMerging {

    public static ArrayList<Double> merge(double[] a, double[] b) {

        if ((a == null) || (b == null)) {
            throw new IllegalArgumentException("Последовательность должна содержать элементы");
        }

        double maxLength = a.length + b.length;
        ArrayList<Double> mergedSequence = new ArrayList<>();
        int indexA = 0, indexB = 0;
        int currentIndex = 0;

        while (currentIndex < maxLength) {

            if ((indexA < a.length) && (indexB < b.length)) {

                if (a[indexA] == b[indexB]) {
                    mergedSequence.add(a[indexA++]);
                    indexB++;
                    currentIndex += 2;
                } else if (a[indexA] < b[indexB]) {
                    mergedSequence.add(a[indexA++]);
                    currentIndex++;
                } else if (b[indexB] < a[indexA]) {
                    mergedSequence.add(b[indexB++]);
                    currentIndex++;
                }

            }

            if ((indexB >= b.length) && (indexA < a.length)) {
                mergedSequence.add(a[indexA++]);
                currentIndex++;
            } else if ((indexA >= a.length) && (indexB < b.length)) {
                mergedSequence.add(b[indexB++]);
                currentIndex++;

            }

        }
        return mergedSequence;
    }
}