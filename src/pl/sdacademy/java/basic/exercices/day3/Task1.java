package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Pattern;

public class Task1 {
    private static final String REGEX_EMAIL_FORMAT = "[A-Za-z0-9]+@[a-z]+(.[a-z]+)*";
    /*
    przed @:
    małe litery
    wielkie litery
    cyfry
    bez znaków specjalnych

    @

    po @:
    male litery
    sda@com sda@com.pl sda@programowanie.com.pl

    ? -> a? -> brak lub jedno wystąpienie litery a
    * -> a* -> brak lub wiele wystąpień litery a
    + -> a+ -> jedno lub wiele wystąpień litery a
     */

    public static void main(String[] args) {
        System.out.println(isCorrectEmailFormat("s@c"));
        System.out.println(isCorrectEmailFormat("1@c"));
        System.out.println(isCorrectEmailFormat("1@1")); //false
        System.out.println(isCorrectEmailFormat(".@1")); //false
        System.out.println(isCorrectEmailFormat("a.@1")); //false
        System.out.println(isCorrectEmailFormat("sda@com"));
        System.out.println(isCorrectEmailFormat("sda1@com"));
        System.out.println(isCorrectEmailFormat("sda1@com.pl"));
        System.out.println(isCorrectEmailFormat("sda1@programowanie.com.pl"));
        System.out.println(isCorrectEmailFormat("sda1@a.b.c"));
        System.out.println(isCorrectEmailFormat("sda1@programowanie.com.pl.")); //false
    }

    /**
     * co robi metoda
     *
     * @param email - co oznacza ten parametr
     * @return co zwracamy
     */
    private static boolean isCorrectEmailFormat(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL_FORMAT);
//        Matcher matcher = pattern.matcher(email);
//        return matcher.matches();
        return pattern.matcher(email).matches();
    }
}
