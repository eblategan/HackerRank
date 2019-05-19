public class DiagonalDifference {

    public static int compute(int[][] array) {
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < array.length; i++) {
            sumRight = sumRight + array[i][i];
            sumLeft = sumLeft + array[(array.length - 1) - i][i];
        }

        return Math.abs(sumLeft - sumRight);
    }
}
