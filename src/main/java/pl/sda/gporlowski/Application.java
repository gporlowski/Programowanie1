package pl.sda.gporlowski;
import java.time.LocalDate;

import static pl.sda.gporlowski.UnitConverter.*;

public class Application {

    public static void main(String[] args) {
        int[] values1 = new int[] {1, 3, 5, 7, 9, 11, 13};
        int[] values2 = new int[] {2, 4, 6, 8, 10, 12, 14};
        int[] values3 = new int[] {-2, 4, -6, 8, -10, 12, -14};

        System.out.println(PseudocodeExerciseImpl.findGreatestValue(values1));
        System.out.println(PseudocodeExerciseImpl.findGreatestValue(values2));
        System.out.println(PseudocodeExerciseImpl.findGreatestValue(values3));
        System.out.println(PseudocodeExerciseImpl.numbersAreEven(values1));
        System.out.println(PseudocodeExerciseImpl.numbersAreEven(values2));
        System.out.println(PseudocodeExerciseImpl.numbersAreEven(values3));
        System.out.println(PseudocodeExerciseImpl.positiveNumbersSum(values1));
        System.out.println(PseudocodeExerciseImpl.positiveNumbersSum(values2));
        System.out.println(PseudocodeExerciseImpl.positiveNumbersSum(values3));
    }
}