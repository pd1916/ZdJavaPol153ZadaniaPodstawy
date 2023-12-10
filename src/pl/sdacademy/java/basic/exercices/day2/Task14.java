package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] numbers = {12, -7, 19, -5};
        int lengthOfResultArray = countNegativeNumbers(numbers);
        if(lengthOfResultArray > 0) {
            int[] result = createArrayWithNegativeNumbers(numbers, lengthOfResultArray);
            System.out.println(Arrays.toString(result));
        }
    }

    private static int countNegativeNumbers(int[] numbers) {
        int counter = 0;
        for(int i : numbers) {
            if(i < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createArrayWithNegativeNumbers(int[] numbers, int size) {
        int[] result = new int[size];
/*        int i = 0;
        for(int element : numbers) {
            if(element < 0) {
                // wpisz wartośc do tablicy result
                result[i] = element;
                i++;
            }
        }*/
        for(int i = 0, j = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                result[j] = numbers[i];
                j++;
            }
        }
        return result;
    }
}
