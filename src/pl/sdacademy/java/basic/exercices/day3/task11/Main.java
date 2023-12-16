package pl.sdacademy.java.basic.exercices.day3.task11;

public class Main {

    public static void main(String[] args) {
        Email email = new Email.Builder()
                .receiver("sda")
                .title("New JAVA course")
                .bodyMsg("Hello!")
                .attachment("introduction.pdf")
                .build();
        System.out.println(email.toString());

        Email email2 = new Email.Builder()
                .receiver("sda")
                .build();
        System.out.println(email2.toString());
    }
}