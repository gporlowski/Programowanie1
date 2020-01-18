package pl.sda.gporlowski;

public class RecursionExercise {

    public static int greatestCommonDivisorIteration (int numberA, int numberB) {
        int gcd = 1;
        for (int i = 1; i <= numberA && i <= numberB; i++) {
            if (numberA % i == 0 && numberB % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int greatestCommonDivisorRecursion (int numberA, int numberB) {
        if(numberB == 0){
            return numberA;
        }
        return greatestCommonDivisorRecursion(numberB, numberA%numberB);
    }

    static long factorial (long number) {
        if (number == 0) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }

}
