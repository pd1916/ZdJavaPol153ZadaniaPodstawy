package pl.sdacademy.java.basic.exercices.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    //private static final String DATE_TIME_FORMAT = "HH:mm:ss yyyy-MM-dd";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date [in format [yyyy-MM-dd HH:mm:ss]: ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, dtf);
        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, nextLesson);
        long days = duration.toDays();
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();
        System.out.printf("You have Days:%01d | Hours: %01d | Minutes: %01d | Secs %01d to the next lesson", days, hours, minutes, seconds);
    }
}
