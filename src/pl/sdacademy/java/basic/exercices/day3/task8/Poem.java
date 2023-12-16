package pl.sdacademy.java.basic.exercices.day3.task8;

import java.util.Objects;

public class Poem {
    private final Author author;
    private final int stropheNumbers;

    public Poem(Author author, int stropheNumbers) {
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Poem poem = (Poem) o;
        return stropheNumbers == poem.stropheNumbers && Objects.equals(author, poem.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, stropheNumbers);
    }
}
