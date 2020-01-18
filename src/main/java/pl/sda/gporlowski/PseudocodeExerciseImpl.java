package pl.sda.gporlowski;

public class PseudocodeExerciseImpl {
    public static int findGreatestValue(int[] values) {
        int greatestValue = 0;
        for (int value : values) {
            if (greatestValue < value) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }

    public static boolean numbersAreEven(int[] values) {
        for (int value : values) {
            if (value % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int positiveNumbersSum (int[] values) {
        int result = 0;
        for (int value : values) {
            if (value > 0) {
                result += value;
            }
        }
        return result;
    }
}
