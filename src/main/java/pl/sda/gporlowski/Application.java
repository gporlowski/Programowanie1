package pl.sda.gporlowski;
import java.time.LocalDate;

import static pl.sda.gporlowski.UnitConverter.*;

public class Application {

    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Brzechwa", "98081559355", LocalDate.of(1998,8,15));
        Person person2 = new Person ("Janek", "Brzechwa", "02281577178", LocalDate.of(2002, 8, 15));

        System.out.println(AgeValidator.isAdult(person1));
        System.out.println(AgeValidator.isAdult(person2));
    }
}