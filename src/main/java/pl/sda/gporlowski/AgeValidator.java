package pl.sda.gporlowski;

import java.time.LocalDate;

public class AgeValidator {

    public static boolean  isAdult(Person person){
        LocalDate today = LocalDate.now();
        LocalDate ageLimit = today.minusYears(18);
        return person.getDateOfBirth().isBefore(ageLimit) || person.getDateOfBirth().equals(ageLimit);
    }
}
