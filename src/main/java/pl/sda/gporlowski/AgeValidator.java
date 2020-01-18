package pl.sda.gporlowski;

import java.time.LocalDate;

public class AgeValidator {

    public static boolean  isAdult(Person person){
        LocalDate ageLimit = LocalDate.now().minusYears(18);

        if (person.getDateOfBirth().isAfter(ageLimit)){
            System.out.println("Access denied");
            return false;
        }

        int yearFromPesel = Integer.parseInt(person.getPeselNumber().substring(0, 2));
        int monthFromPesel = Integer.parseInt(person.getPeselNumber().substring(2,4));
        int dayFromPesel = Integer.parseInt(person.getPeselNumber().substring(4,6));

        if (Integer.parseInt(person.getPeselNumber().substring(2, 3)) > 1){
            yearFromPesel += 2000;
            monthFromPesel -= 20;
        } else {
            yearFromPesel += 1900;
        }

        LocalDate dateFromPesel = LocalDate.of(yearFromPesel, monthFromPesel, dayFromPesel);

        if (!dateFromPesel.isEqual(person.getDateOfBirth())) {
            System.out.println("Access denied");
            System.out.println("Error. The date of birth is incorrect.");
            return false;
        }

        System.out.println("Acces granted.");
        return true;
    }


}
