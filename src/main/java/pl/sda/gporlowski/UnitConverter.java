package pl.sda.gporlowski;

public class UnitConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32) * 0.5556;
    }

    public static double kilometerToMile (double kilometer) {
        return kilometer / 1.609344;
    }

    public static double mileToKilometer (double mile) {
        return mile * 1.609344;
    }

    public static double kilogramToPound (double kilogram) {
        return kilogram / 0.45359237;
    }

    public static double poundToKilogram (double pound) {
        return pound * 0.45359237;
    }
}
