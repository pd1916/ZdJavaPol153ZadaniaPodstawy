package pl.sdacademy.java.basic.exercices.day3.task12;

import pl.sdacademy.java.basic.exercices.day3.task12.Computer.ExternalPort;
import pl.sdacademy.java.basic.exercices.day3.task12.Computer.Memory;
import pl.sdacademy.java.basic.exercices.day3.task12.Computer.Processor;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor(10, "Intel");
        Memory memory = new Memory(8192, "Lenovo", "SSD");
        ExternalPort externalPort = new ExternalPort("USB");
        Computer computer = new Computer(processor, memory, externalPort);
        System.out.println(computer);
    }
}
