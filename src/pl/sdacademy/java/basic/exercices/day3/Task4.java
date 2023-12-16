package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Pattern;

public class Task4 {
    private static final String REGEX_V1 = "a+ psik";
    private static final String REGEX_V2 = "a+ (psik|Psik)"; //wtedy akceptowalny będzie psik lub Psik

    public static void main(String[] args) {
        System.out.println(isContainsAString("a Psik")); //false
        System.out.println(isContainsAString("a psik")); //true
        System.out.println(isContainsAString("aaa psik")); //true
        System.out.println(isContainsAString("aaapsik")); //false
        System.out.println(isContainsAString("psik")); //false
        System.out.println(isContainsAString(" psik")); //false
    }

    private static boolean isContainsAString(String input) {
        Pattern pattern = Pattern.compile(REGEX_V1);
        return pattern.matcher(input).matches();
    }
}
