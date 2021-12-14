package by.bsuir.dshparko.wt.tasks.first.task7.logic;

public class ShellSort {
    public static double[] sort(double[] array) {

        if (array == null) {
            throw new IllegalArgumentException("Массив должен содержать элементы!");
        }
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1])
                i++;
            else {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0)
                    i--;
            }
        }
        return array;
    }
}
