package pl.sda.gporlowski;
import static pl.sda.gporlowski.UnitConverter.*;

public class Application {

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(30));
        System.out.println(fahrenheitToCelsius(50));
        System.out.println(kilometerToMile(20));
        System.out.println(mileToKilometer(20));
        System.out.println(kilogramToPound(5));
        System.out.println(poundToKilogram(5));
    }
}