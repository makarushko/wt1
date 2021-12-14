package by.bsuir.dshparko.wt.tasks.first.task5.logic;

public class MinElement {

    public static int getMinElements(int[] arr) {

        int maxIncreaseLen = 0, curIncreaseLen;
        boolean isIncrease;

        if (arr == null) {
            throw new IllegalArgumentException("Массив пустой.");
        }

        for (int i = 0; i < arr.length; i++) {
            isIncrease = true;
            curIncreaseLen = 1;
            for (int j = i + 1; (j < arr.length) && isIncrease; j++) {
                if (arr[j - 1] < arr[j]) {
                    curIncreaseLen++;
                } else {
                    isIncrease = false;
                }
            }
            maxIncreaseLen = Math.max(maxIncreaseLen, curIncreaseLen);
        }
        return arr.length - maxIncreaseLen;
    }
}
