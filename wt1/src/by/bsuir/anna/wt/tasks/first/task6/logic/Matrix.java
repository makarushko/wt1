package by.bsuir.anna.wt.tasks.first.task6.logic;

public class Matrix {
    public static int[][] fillMatrix(int[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int step = 0;
        int[][] matrix = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[(j + step) % arr.length];
            }
            step++;
        }
        return matrix;

    }
}
