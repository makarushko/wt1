package by.bsuir.anna.wt.tasks.first.task4.logic;

import java.util.ArrayList;

public class PrimeNumber {
    public static boolean checkPrime(int var) {
        int temp;
        if (var == 1 || var <= 0)
            return false;
        for (int i = 2; i < var / 2; i++) {
            temp = var % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] findSimpleNumbers(int[] arr) {
        boolean flag;
        ArrayList<Integer> indexList = new ArrayList<>();
        if (arr == null) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        for (int i = 0; i < arr.length; i++) {
            flag = checkPrime(arr[i]);
            if (flag) {
                indexList.add(i);
            }
        }

        if (indexList.isEmpty()) {
            throw new IllegalArgumentException("В массиве нет простых чисел.");
        }
        int[] simpleArr = getArray(indexList);
        return simpleArr;
    }

    private static int[] getArray(ArrayList<Integer> list) {
        int[] arr = new int[list.size()];
        int count = 0;
        for (int value : list) {
            arr[count] = value;
            count++;
        }
        return arr;
    }
}
