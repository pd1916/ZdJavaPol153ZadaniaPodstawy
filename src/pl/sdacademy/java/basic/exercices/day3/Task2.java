package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Pattern;

public class Task2 {
    private static final String REGEX_IBAN_FORMAT = "PL[0-9]{26}";

    public static void main(String[] args) {
        System.out.println(isCorrectIbanFormat("PL12345123451234512345123456"));
        System.out.println(isCorrectIbanFormat("PP12345123451234512345123456")); //false
        System.out.println(isCorrectIbanFormat("PLPL12345123451234512345123456")); //false
        System.out.println(isCorrectIbanFormat("PL123451234512345123451234")); //false
    }

    private static boolean isCorrectIbanFormat(String iban) {
        Pattern pattern = Pattern.compile(REGEX_IBAN_FORMAT); //[A-Z]{2}
        return pattern.matcher(iban).matches();
    }
}
