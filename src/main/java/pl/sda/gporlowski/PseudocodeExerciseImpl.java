package pl.sda.gporlowski;

public class PseudocodeExerciseImpl {

    public static int findGreatestValue(int[] arr) {
        int greatestValue = arr[0];
        for (int i : arr) {
            if (greatestValue < i) {
                greatestValue = i;
            }
        }
        return greatestValue;
    }

    public static boolean numbersAreEven(int[] arr) {
        for (int i : arr) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int positiveNumbersSum (int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }

    public static int averagePositiveNumbers (int[] arr) {
        int averageValue = 0;
        for (int value : arr) {
            if (value > 0) {
                averageValue += value;
            }
        }
        return averageValue;
    }

}
