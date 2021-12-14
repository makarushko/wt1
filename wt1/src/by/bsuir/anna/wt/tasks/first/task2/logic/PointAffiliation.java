package by.bsuir.anna.wt.tasks.first.task2.logic;

public class PointAffiliation {
    private static final int UPPER_X1 = -4;
    private static final int UPPER_X2 = 4;
    private static final int UPPER_Y1 = 0;
    private static final int UPPER_Y2 = 5;

    private static final int LOWER_X1 = -6;
    private static final int LOWER_X2 = 6;
    private static final int LOWER_Y1 = -3;
    private static final int LOWER_Y2 = 0;

    public static boolean checkAffiliation(double x, double y) {
        boolean isAnswer = false;
        if (((y <= UPPER_Y2) && (y >= UPPER_Y1) && (x <= UPPER_X2) && (x >= UPPER_X1)) || ((y >= LOWER_Y1) && (y <= LOWER_Y2) && (x <= LOWER_X2) && (x >= LOWER_X1))) {
            isAnswer = true;
        }
        return isAnswer;
    }
}
