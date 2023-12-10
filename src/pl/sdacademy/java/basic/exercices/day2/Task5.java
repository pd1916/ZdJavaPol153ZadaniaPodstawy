package pl.sdacademy.java.basic.exercices.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedCharacter = 'z';
        int result = countCharacters(input, searchedCharacter);
        System.out.println(result);
    }

    private static int countCharacters(String input, char searchedCharacter) {
        int counter = 0;
        if(StringValidator.isValid(input) && input.contains(String.valueOf(searchedCharacter))) {
            for(int i = input.indexOf(searchedCharacter); i < input.length(); i++) {
                if(input.charAt(i) == searchedCharacter) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
